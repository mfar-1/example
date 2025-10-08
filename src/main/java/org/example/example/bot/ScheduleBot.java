package org.example.example.bot;

import org.example.example.model.ScheduleData;
import org.example.example.service.KeyboardService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;

@Component
public class ScheduleBot extends TelegramLongPollingBot {

    private final String botUsername;
    private final KeyboardService keyboardService;

    private static final Map<DayOfWeek, String> dayOfWeekMap = Map.of(
            DayOfWeek.MONDAY, "Du", DayOfWeek.TUESDAY, "Se", DayOfWeek.WEDNESDAY, "Ch",
            DayOfWeek.THURSDAY, "Pa", DayOfWeek.FRIDAY, "Ju", DayOfWeek.SATURDAY, "Sh"
    );

    public ScheduleBot(@Value("${bot.token}") String botToken,
                       @Value("${bot.name}") String botUsername,
                       KeyboardService keyboardService) {
        super(botToken);
        this.botUsername = botUsername;
        this.keyboardService = keyboardService;
    }

    @Override
    public String getBotUsername() { return this.botUsername; }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("/start")) {
            sendWelcomeMessage(update.getMessage().getChatId());
        } else if (update.hasCallbackQuery()) {
            handleCallbackQuery(update);
        }
    }

    private void handleCallbackQuery(Update update) {
        String callbackData = update.getCallbackQuery().getData();
        long chatId = update.getCallbackQuery().getMessage().getChatId();
        int messageId = update.getCallbackQuery().getMessage().getMessageId();
        Message originalMessage = update.getCallbackQuery().getMessage(); // Original xabarni olamiz

        if (callbackData.startsWith("GROUP_")) {
            String groupName = callbackData.substring(6);
            sendDaySelectionMessage(chatId, messageId, groupName, originalMessage);
        } else if (callbackData.startsWith("DAY_")) {
            String[] parts = callbackData.split("_");
            String day = parts[1];
            String groupName = parts[2];
            sendSchedule(chatId, messageId, groupName, day, originalMessage);
        } else if (callbackData.startsWith("QUICK_TODAY_")) {
            String groupName = callbackData.substring(12);
            sendScheduleForDay(chatId, messageId, groupName, LocalDate.now(), originalMessage);
        } else if (callbackData.startsWith("QUICK_TOMORROW_")) {
            String groupName = callbackData.substring(15);
            sendScheduleForDay(chatId, messageId, groupName, LocalDate.now().plusDays(1), originalMessage);
        } else if (callbackData.equals("BACK_TO_GROUPS")) {
            editToGroupSelectionMessage(chatId, messageId, originalMessage);
        }
    }

    private void sendWelcomeMessage(long chatId) {
        SendMessage message = new SendMessage(String.valueOf(chatId), "Assalomu alaykum! 👋\n\nMen <b>Quyi Chirchiq 1-sonli politexnikum</b>ning rasmiy dars jadvali botiman.\n\nIltimos, o'z guruhingizni tanlang:");
        message.setParseMode("HTML");
        message.setReplyMarkup(keyboardService.createGroupSelectionKeyboard());
        executeWithTryCatch(message);
    }

    private void editToGroupSelectionMessage(long chatId, int messageId, Message originalMessage) {
        String newText = "Iltimos, o'z guruhingizni tanlang:";
        if (originalMessage.getText().equals(newText)) return;

        EditMessageText editMessage = new EditMessageText(newText);
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setReplyMarkup(keyboardService.createGroupSelectionKeyboard());
        executeWithTryCatch(editMessage);
    }

    private void sendDaySelectionMessage(long chatId, int messageId, String groupName, Message originalMessage) {
        String newText = "✅ Guruh: <b>" + groupName + "</b>\n\nIltimos, kerakli kunni tanlang yoki tezkor tugmalardan foydaning:";
        if (originalMessage.getText().equals(newText)) return;

        EditMessageText editMessage = new EditMessageText(newText);
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setParseMode("HTML");
        editMessage.setReplyMarkup(keyboardService.createDaySelectionKeyboard(groupName));
        executeWithTryCatch(editMessage);
    }

    private void sendSchedule(long chatId, int messageId, String groupName, String day, Message originalMessage) {
        String scheduleText = ScheduleData.getSchedule(groupName, day);
        if (originalMessage.getText().equals(scheduleText)) {
            return;
        }

        EditMessageText editMessage = new EditMessageText(scheduleText);
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setParseMode("HTML");
        editMessage.setReplyMarkup(keyboardService.createDaySelectionKeyboard(groupName));
        executeWithTryCatch(editMessage);
    }

    private void sendScheduleForDay(long chatId, int messageId, String groupName, LocalDate date, Message originalMessage) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            String sundayMessage = "✅ Guruh: <b>" + groupName + "</b>\n\nBugun Yakshanba — dam olish kuni. 😉";
            sendSchedule(chatId, messageId, groupName, sundayMessage, originalMessage);
            return;
        }
        String dayAbbr = dayOfWeekMap.get(dayOfWeek);
        sendSchedule(chatId, messageId, groupName, dayAbbr, originalMessage);
    }

    private void executeWithTryCatch(Object method) {
        try {
            if (method instanceof SendMessage) {
                execute((SendMessage) method);
            } else if (method instanceof EditMessageText) {
                execute((EditMessageText) method);
            }
        } catch (TelegramApiException e) {
            if (!e.getMessage().contains("message is not modified")) {
                e.printStackTrace();
            }
        }
    }
}