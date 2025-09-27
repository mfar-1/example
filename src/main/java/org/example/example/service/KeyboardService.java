package org.example.example.service;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

public interface KeyboardService {

    InlineKeyboardMarkup createGroupSelectionKeyboard();
    InlineKeyboardMarkup createDaySelectionKeyboard(String groupName);
}