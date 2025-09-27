package org.example.example.bot;

import org.example.example.model.ScheduleData;
import org.example.example.service.KeyboardService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class ScheduleBot extends TelegramLongPollingBot {

    private final String botUsername;
    private final KeyboardService keyboardService;

    public ScheduleBot(@Value("${bot.token}") String botToken,
                       @Value("${bot.name}") String botUsername,
                       KeyboardService keyboardService) {
        super(botToken);
        this.botUsername = botUsername;
        this.keyboardService = keyboardService;
    }

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("/start")) {
            long chatId = update.getMessage().getChatId();
            sendGroupSelectionMessage(chatId);
        } else if (update.hasCallbackQuery()) {
            handleCallbackQuery(update);
        }
    }

    private void handleCallbackQuery(Update update) {
        String callbackData = update.getCallbackQuery().getData();
        long chatId = update.getCallbackQuery().getMessage().getChatId();
        int messageId = update.getCallbackQuery().getMessage().getMessageId();

        if (callbackData.startsWith("GROUP_")) {
            String groupName = callbackData.substring(6);
            sendDaySelectionMessage(chatId, messageId, groupName);
        } else if (callbackData.startsWith("DAY_")) {
            String[] parts = callbackData.split("_");
            String day = parts[1];
            String groupName = parts[2];
            sendSchedule(chatId, messageId, groupName, day);
        } else if (callbackData.equals("BACK_TO_GROUPS")) {
            editToGroupSelectionMessage(chatId, messageId);
        }
    }

    private void sendGroupSelectionMessage(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText("Assalomu alaykum! 👋\n\nMen sizga dars jadvalini topishda yordam beraman.\n\nIltimos, o'z guruhingizni tanlang:");
        message.setReplyMarkup(keyboardService.createGroupSelectionKeyboard());
        executeWithTryCatch(message);
    }

    private void sendDaySelectionMessage(long chatId, int messageId, String groupName) {
        EditMessageText editMessage = new EditMessageText();
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setText("✅ Guruh: <b>" + groupName + "</b>\n\nHafta kunini tanlang:");
        editMessage.setParseMode("HTML");
        editMessage.setReplyMarkup(keyboardService.createDaySelectionKeyboard(groupName));
        executeWithTryCatch(editMessage);
    }

    private void sendSchedule(long chatId, int messageId, String groupName, String day) {
        String scheduleText = ScheduleData.getSchedule(groupName, day);

        EditMessageText editMessage = new EditMessageText();
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setText(scheduleText);
        editMessage.setParseMode("HTML");
        editMessage.setReplyMarkup(keyboardService.createDaySelectionKeyboard(groupName));
        executeWithTryCatch(editMessage);
    }

    private void editToGroupSelectionMessage(long chatId, int messageId) {
        EditMessageText editMessage = new EditMessageText();
        editMessage.setChatId(String.valueOf(chatId));
        editMessage.setMessageId(messageId);
        editMessage.setText("Iltimos, o'z guruhingizni tanlang:");
        editMessage.setReplyMarkup(keyboardService.createGroupSelectionKeyboard());
        executeWithTryCatch(editMessage);
    }

    private void executeWithTryCatch(Object method) {
        try {
            if (method instanceof SendMessage) {
                execute((SendMessage) method);
            } else if (method instanceof EditMessageText) {
                execute((EditMessageText) method);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}