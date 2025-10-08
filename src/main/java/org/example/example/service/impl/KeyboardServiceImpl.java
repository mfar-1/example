package org.example.example.service.impl;

import org.example.example.model.ScheduleData;
import org.example.example.service.KeyboardService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KeyboardServiceImpl implements KeyboardService {

    @Override
    public InlineKeyboardMarkup createGroupSelectionKeyboard() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        List<String> groups = new ArrayList<>(ScheduleData.getSchedules().keySet());

        for (int i = 0; i < groups.size(); i += 2) {
            List<InlineKeyboardButton> row = new ArrayList<>();

            InlineKeyboardButton button1 = new InlineKeyboardButton("👨‍🎓 " + groups.get(i));
            button1.setCallbackData("GROUP_" + groups.get(i));
            row.add(button1);

            if (i + 1 < groups.size()) {
                InlineKeyboardButton button2 = new InlineKeyboardButton("👨‍🎓 " + groups.get(i + 1));
                button2.setCallbackData("GROUP_" + groups.get(i + 1));
                row.add(button2);
            }
            keyboard.add(row);
        }
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }

    @Override
    public InlineKeyboardMarkup createDaySelectionKeyboard(String groupName) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> quickAccessRow = new ArrayList<>();
        InlineKeyboardButton todayButton = new InlineKeyboardButton("🗓 Bugun");
        todayButton.setCallbackData("QUICK_TODAY_" + groupName);
        quickAccessRow.add(todayButton);

        InlineKeyboardButton tomorrowButton = new InlineKeyboardButton("🗓 Ertaga");
        tomorrowButton.setCallbackData("QUICK_TOMORROW_" + groupName);
        quickAccessRow.add(tomorrowButton);
        keyboard.add(quickAccessRow);

        List<String> days = Arrays.asList("Du", "Se", "Ch", "Pa", "Ju", "Sh");
        List<String> dayNames = Arrays.asList("Dushanba", "Seshanba", "Chorshanba", "Payshanba", "Juma", "Shanba");
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        for (int i = 0; i < dayNames.size(); i++) {
            InlineKeyboardButton button = new InlineKeyboardButton(dayNames.get(i));
            button.setCallbackData("DAY_" + days.get(i) + "_" + groupName);
            if (i < 3) { row1.add(button); } else { row2.add(button); }
        }
        keyboard.add(row1);
        keyboard.add(row2);

        List<InlineKeyboardButton> backRow = new ArrayList<>();
        InlineKeyboardButton backButton = new InlineKeyboardButton("⬅️ Orqaga (Guruh tanlash)");
        backButton.setCallbackData("BACK_TO_GROUPS");
        backRow.add(backButton);
        keyboard.add(backRow);

        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
}