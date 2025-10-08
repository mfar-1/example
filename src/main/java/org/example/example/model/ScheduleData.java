package org.example.example.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ScheduleData {

    private static final Map<String, Map<String, String>> schedules = new LinkedHashMap<>();

    static {
        // ATXK-A
        Map<String, String> atxkA = new LinkedHashMap<>();
        atxkA.put("Du", "🗓 <b>Dushanba (ATXK-A):</b>\n\n<b>1-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>3-dars: Avtomobil divigatel va</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>4-dars: Avtomobil elektor</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Qurbonov N</i>");
        atxkA.put("Se", "🗓 <b>Seshanba (ATXK-A):</b>\n\n<b>1-dars: Mehnat muhofazasi / Avtomobil elektor</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>2-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Xaydarov D</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>");
        atxkA.put("Ch", "🗓 <b>Chorshanba (ATXK-A):</b>\n\n<b>1-dars: Tarbiya / Informatika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Usarov O / Tangirov Sh</i>\n\n<b>2-dars: Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>3-dars: Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Namazbayev A</i>");
        atxkA.put("Pa", "🗓 <b>Payshanba (ATXK-A):</b>\n\n<b>1-dars: Matematika / Biznes asoslari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A / Tojiboyev S</i>\n\n<b>2-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>3-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xaydarov D</i>");
        atxkA.put("Ju", "🗓 <b>Juma (ATXK-A):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>2-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>3-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xaydarov D</i>");
        atxkA.put("Sh", "🗓 <b>Shanba (ATXK-A):</b>\n\n<b>1-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>2-dars: Tarix</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Sultanbekova U</i>\n\n<b>3-dars: Informatika</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>4-dars: Chet tili</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>");
        schedules.put("ATXK-A", atxkA);

        // ATXK-B
        Map<String, String> atxkB = new LinkedHashMap<>();
        atxkB.put("Du", "🗓 <b>Dushanba (ATXK-B):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>2-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Xaydarov D</i>\n\n<b>3-dars: Jismoniy tarbiya / Biznes asoslari</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Namazbayev A / Tojiboyev S</i>");
        atxkB.put("Se", "🗓 <b>Seshanba (ATXK-B):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>2-dars: Avtomobil elektr va / Matematika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Qurbonov N / Karimjonov A</i>\n\n<b>3-dars: Avtomobil dvigatella</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>4-dars: Informatika / Avtomobil dvigatella</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Tangirov Sh / Qurbonov N</i>");
        atxkB.put("Ch", "🗓 <b>Chorshanba (ATXK-B):</b>\n\n<b>1-dars: Tarix</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>\n\n<b>2-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>3-dars: Avtomobil elektr va</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Qurbonov N</i>");
        atxkB.put("Pa", "🗓 <b>Payshanba (ATXK-B):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>2-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Xaydarov D</i>\n\n<b>3-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>4-dars: Informatika</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        atxkB.put("Ju", "🗓 <b>Juma (ATXK-B):</b>\n\n<b>1-dars: Mehnat muhofazasi va / Tarbiya</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Qurbonov N / O sarov O</i>\n\n<b>2-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>");
        atxkB.put("Sh", "🗓 <b>Shanba (ATXK-B):</b>\n\n<b>1-dars: Matematika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>2-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>");
        schedules.put("ATXK-B", atxkB);

        // ATXK-C
        Map<String, String> atxkC = new LinkedHashMap<>();
        atxkC.put("Du", "🗓 <b>Dushanba (ATXK-C):</b>\n\n<b>1-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>2-dars: Tarbiya / Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: O sarov O / Namazbayev A</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>");
        atxkC.put("Se", "🗓 <b>Seshanba (ATXK-C):</b>\n\n<b>1-dars: Informatika / Biznes asoslari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tangirov Sh / Tojiboyev S</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>3-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xaydarov D</i>");
        atxkC.put("Ch", "🗓 <b>Chorshanba (ATXK-C):</b>\n\n<b>1-dars: Avtomobil elektr va</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>2-dars: Matematika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>3-dars: Informatika</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>4-dars: Mehnat muhofazasi va / Avtomobil elektr va</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Qurbonov N / Qurbonov N</i>");
        atxkC.put("Pa", "🗓 <b>Payshanba (ATXK-C):</b>\n\n<b>1-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Xaydarov D</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>3-dars: Tarix</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>");
        atxkC.put("Ju", "🗓 <b>Juma (ATXK-C):</b>\n\n<b>1-dars: Yo'l harakati qoidalari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Xaydarov D</i>\n\n<b>2-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>3-dars: Matematika</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Karimjonov A</i>");
        atxkC.put("Sh", "🗓 <b>Shanba (ATXK-C):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Saidkarimova O</i>\n\n<b>2-dars: Avtomobil tuzilishi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Qurbonov N</i>\n\n<b>3-dars: Avtomobil dvigatella</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Qurbonov N</i>");
        schedules.put("ATXK-C", atxkC);

        // KTD-A
        Map<String, String> ktdA = new LinkedHashMap<>();
        ktdA.put("Du", "🗓 <b>Dushanba (KTD-A):</b>\n\n<b>1-dars: Tarix</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>\n\n<b>2-dars: Axborot texnologiyalari / Ma'lumotlar bazasi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tangirov Sh / Tangirov Sh</i>\n\n<b>3-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Berdikulova A</i>");
        ktdA.put("Se", "🗓 <b>Seshanba (KTD-A):</b>\n\n<b>1-dars: Matematika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>3-dars: Dasturlashtirish tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdA.put("Ch", "🗓 <b>Chorshanba (KTD-A):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Dasturlash asoslari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Namazbayev A</i>\n\n<b>3-dars: Tarbiya</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: O sarov O</i>");
        ktdA.put("Pa", "🗓 <b>Payshanba (KTD-A):</b>\n\n<b>1-dars: Informatika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tursunbayeva N</i>\n\n<b>2-dars: Jismoniy tarbiya / Tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Namazbayev A / O sarov O</i>\n\n<b>3-dars: Axborot xavfsizligi</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdA.put("Ju", "🗓 <b>Juma (KTD-A):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Axborot texnologiyalari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdA.put("Sh", "🗓 <b>Shanba (KTD-A):</b>\n\n<b>1-dars: Mehnat muhofazasi va</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>3-dars: Matematika / Kino</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Karimjonov A / Djo`rayeva M</i>\n\n<b>4-dars: Chet tili</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        schedules.put("KTD-A", ktdA);

        // KTD-B
        Map<String, String> ktdB = new LinkedHashMap<>();
        ktdB.put("Du", "🗓 <b>Dushanba (KTD-B):</b>\n\n<b>1-dars: Tarbiya / Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: O sarov O / Namazbayev A</i>\n\n<b>2-dars: Tarix</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Sultanbekova U</i>\n\n<b>3-dars: Dasturlash asoslari</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdB.put("Se", "🗓 <b>Seshanba (KTD-B):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Dasturlashtirish tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdB.put("Ch", "🗓 <b>Chorshanba (KTD-B):</b>\n\n<b>1-dars: Axborot texnologiyalari / Matematika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tangirov Sh / Karimjonov A</i>\n\n<b>2-dars: Tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: O sarov O</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        ktdB.put("Pa", "🗓 <b>Payshanba (KTD-B):</b>\n\n<b>1-dars: Axborot texnologiyalari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>3-dars: Informatika</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tursunbayeva N</i>");
        ktdB.put("Ju", "🗓 <b>Juma (KTD-B):</b>\n\n<b>1-dars: Matematika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>2-dars: Axborot xavfsizligi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>3-dars: Axborot xavfsizligi</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Tangirov Sh</i>");
        ktdB.put("Sh", "🗓 <b>Shanba (KTD-B):</b>\n\n<b>1-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>2-dars: Mehnat muhofazasi va</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tangirov Sh</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>4-dars: Ma'lumotlar bazasi / Kino</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Tursunbekova M / Djo`rayeva M</i>");
        schedules.put("KTD-B", ktdB);

        // AT
        Map<String, String> at = new LinkedHashMap<>();
        at.put("Du", "🗓 <b>Dushanba (AT):</b>\n\n<b>1-dars: Tuproq bonitirovkasi</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tursunbekova M</i>\n\n<b>2-dars: Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Namazbayev A</i>\n\n<b>3-dars: Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xamraqulova Z</i>");
        at.put("Se", "🗓 <b>Seshanba (AT):</b>\n\n<b>1-dars: Biologiya</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Ibragimov A</i>\n\n<b>2-dars: Informatika / Umumiy va qishloq xo'jaligi</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tursunbekova M</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xamraqulova Z</i>");
        at.put("Ch", "🗓 <b>Chorshanba (AT):</b>\n\n<b>1-dars: Matematika / Tarbiya</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A / O sarov O</i>\n\n<b>2-dars: Tuproqshunoslik va a</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tursunbekova M</i>\n\n<b>3-dars: Tuproqshunoslik va a</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xamraqulova Z</i>");
        at.put("Pa", "🗓 <b>Payshanba (AT):</b>\n\n<b>1-dars: O'simlikshunoslik / Kino</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tursunbekova M / Quronboyeva F</i>\n\n<b>2-dars: Tuproqshunoslik va a</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tursunbekova M</i>\n\n<b>3-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>4-dars: Informatika</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Tursunbayeva N</i>");
        at.put("Ju", "🗓 <b>Juma (AT):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Xamraqulova Z</i>\n\n<b>2-dars: Tarbiya</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: O sarov O</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Quronboyeva F</i>");
        at.put("Sh", "🗓 <b>Shanba (AT):</b>\n\n<b>1-dars: Tarix</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>\n\n<b>2-dars: Matematika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Xamraqulova Z</i>");
        schedules.put("AT", at);

        // TCH
        Map<String, String> tch = new LinkedHashMap<>();
        tch.put("Du", "🗓 <b>Dushanba (TCH):</b>\n\n<b>1-dars: Matematika</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>4-dars: Ayollar kiyimini kon /</b>\n<i>⏰ Vaqt: 13:00-14:20</i>");
        tch.put("Se", "🗓 <b>Seshanba (TCH):</b>\n\n<b>1-dars: Informatika / Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Tursunbayeva N / Namazbayev A</i>\n\n<b>2-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        tch.put("Ch", "🗓 <b>Chorshanba (TCH):</b>\n\n<b>1-dars: Tikuvchilik texnologiyasi</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Rasmanova O</i>\n\n<b>2-dars: Kimyo</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Quronboyeva F</i>\n\n<b>3-dars: Tarix</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>");
        tch.put("Pa", "🗓 <b>Payshanba (TCH):</b>\n\n<b>1-dars: Tikuvchilik texnologiyasi</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Rasmanova O</i>\n\n<b>2-dars: Informatika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Tursunbayeva N</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        tch.put("Ju", "🗓 <b>Juma (TCH):</b>\n\n<b>1-dars: Tikuvchilik materiallari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Rasmanova O</i>\n\n<b>2-dars: Tikuvchilik materiallari</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Rasmanova O</i>\n\n<b>3-dars: Matematika</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Karimjonov A</i>");
        tch.put("Sh", "🗓 <b>Shanba (TCH):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Maxsus rasm</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Rasmanova O</i>\n\n<b>3-dars: Mehnat muhofazasi va</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Rasmanova O</i>");
        schedules.put("TCH", tch);

        // EM
        Map<String, String> em = new LinkedHashMap<>();
        em.put("Du", "🗓 <b>Dushanba (EM):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Matematika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>3-dars: Tarix</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Sultanbekova U</i>");
        em.put("Se", "🗓 <b>Seshanba (EM):</b>\n\n<b>1-dars: Ona tili va adabiyot</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Berdikulova A</i>\n\n<b>2-dars: Elektrotexnika va el / Informatika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: 18-o`qit. / Tursunbayeva N</i>\n\n<b>3-dars: Chet tili</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        em.put("Ch", "🗓 <b>Chorshanba (EM):</b>\n\n<b>1-dars: Kimyo</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Quronboyeva F</i>\n\n<b>2-dars: Chet tili</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        em.put("Pa", "🗓 <b>Payshanba (EM):</b>\n\n<b>1-dars: Chet tili</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: Djo`rayeva M</i>\n\n<b>2-dars: Matematika</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: Karimjonov A</i>\n\n<b>3-dars: Jismoniy tarbiya</b>\n<i>⏰ Vaqt: 11:30-12:50</i>\n<i>👤 Ustoz: Namazbayev A</i>\n\n<b>4-dars: Chet tili</b>\n<i>⏰ Vaqt: 13:00-14:20</i>\n<i>👤 Ustoz: Djo`rayeva M</i>");
        em.put("Ju", "🗓 <b>Juma (EM):</b>\n\n<b>1-dars: Elektr o'lchash asboblari</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: 18-o`qit.</i>\n\n<b>2-dars: Elektrotexnika va el</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: 18-o`qit.</i>");
        em.put("Sh", "🗓 <b>Shanba (EM):</b>\n\n<b>1-dars: Texnikaviy chizmachilik</b>\n<i>⏰ Vaqt: 08:30-09:50</i>\n<i>👤 Ustoz: 18-o`qit.</i>\n\n<b>2-dars: Elektrotexnik materiallar</b>\n<i>⏰ Vaqt: 10:00-11:20</i>\n<i>👤 Ustoz: 18-o`qit.</i>");
        schedules.put("EM", em);

    }

    public static String getSchedule(String group, String day) {
        return schedules.getOrDefault(group, new LinkedHashMap<>())
                .getOrDefault(day, "Ushbu kun uchun dars jadvali topilmadi.");
    }

    public static Map<String, Map<String, String>> getSchedules() {
        return schedules;
    }
}