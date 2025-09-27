package org.example.example.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class ScheduleData {

    private static final Map<String, Map<String, String>> schedules = new LinkedHashMap<>();

    static {
        // =================================================================================
        // ATXK-A guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> atxkA = new LinkedHashMap<>();
        atxkA.put("Du", "<b>Dushanba (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Ona tili va adabiyot (Berdikulova A)\n" +
                "2. 10:00-11:20: Avtomobil dvigatella (Qurbonov N)\n" +
                "3. 11:30-12:50: Avtomobil elektr va (Qurbonov N)");
        atxkA.put("Se", "<b>Seshanba (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Mehnat muhofazasi va (Qurbonov N)\n" +
                "2. 10:00-11:20: Yo'l harakati qoidal (Xaydarov D)\n" +
                "3. 11:30-12:50: Chet tili (Saidkarimova O)");
        atxkA.put("Chor", "<b>Chorshanba (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Tarbiya / Informatika va axbor (O sarov O / Tangirov Sh)\n" +
                "2. 10:00-11:20: Jismoniy tarbiya (Saidkarimova O)\n" +
                "3. 11:30-12:50: Jismoniy tarbiya (Namazbayev A)");
        atxkA.put("Pay", "<b>Payshanba (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Matematika / Biznes asoslari (Karimjonov A / Tojiboyev S)\n" +
                "2. 10:00-11:20: Avtomobil tuzilishi (Qurbonov N)\n" +
                "3. 11:30-12:50: Yo'l harakati qoidal (Xaydarov D)");
        atxkA.put("Ju", "<b>Juma (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Saidkarimova O)\n" +
                "2. 10:00-11:20: Yo'l harakati qoidal (Karimjonov A)\n" +
                "3. 11:30-12:50: Yo'l harakati qoidal (Xaydarov D)");
        atxkA.put("Sham", "<b>Shanba (ATXK-A):</b>\n\n" +
                "1. 08:30-09:50: Avtomobil tuzilishi (Qurbonov N)\n" +
                "2. 10:00-11:20: Tarix (Sultanbekova U)\n" +
                "3. 11:30-12:50: Informatika va axbor (Tangirov Sh)\n" +
                "4. 13:00-14:20: Chet tili (Saidkarimova O)");
        schedules.put("ATXK-A", atxkA);

        // =================================================================================
        // ATXK-B guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> atxkB = new LinkedHashMap<>();
        atxkB.put("Du", "<b>Dushanba (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Saidkarimova O)\n" +
                "2. 10:00-11:20: Yo'l harakati qoidal (Xaydarov D)\n" +
                "3. 11:30-12:50: Jismoniy tarbiya / Biznes asoslari (Namazbayev A / Tojiboyev S)");
        atxkB.put("Se", "<b>Seshanba (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Saidkarimova O)\n" +
                "2. 10:00-11:20: Avtomobil elektr va / Matematika (Qurbonov N / Karimjonov A)\n" +
                "3. 11:30-12:50: Avtomobil dvigatella (Qurbonov N)\n" +
                "4. 13:00-14:20: Informatika va axbor / Avtomobil dvigatella (Tangirov Sh / Qurbonov N)");
        atxkB.put("Ch", "<b>Chorshanba (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Tarix (Sultanbekova U)\n" +
                "2. 10:00-11:20: Avtomobil tuzilishi (Qurbonov N)\n" +
                "3. 11:30-12:50: Avtomobil elektr va (Qurbonov N)");
        atxkB.put("Pa", "<b>Payshanba (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Saidkarimova O)\n" +
                "2. 10:00-11:20: Yo'l harakati qoidal (Xaydarov D)\n" +
                "3. 11:30-12:50: Avtomobil tuzilishi (Qurbonov N)\n" +
                "4. 13:00-14:20: Informatika va axbor (Tangirov Sh)");
        atxkB.put("Ju", "<b>Juma (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Mehnat muhofazasi va / Tarbiya (Qurbonov N / O sarov O)\n" +
                "2. 10:00-11:20: Yo'l harakati qoidal (Saidkarimova O)\n" +
                "3. 11:30-12:50: Chet tili (Saidkarimova O)");
        atxkB.put("Sh", "<b>Shanba (ATXK-B):</b>\n\n" +
                "1. 08:30-09:50: Matematika (Karimjonov A)\n" +
                "2. 10:00-11:20: Ona tili va adabiyot (Berdikulova A)\n" +
                "3. 11:30-12:50: Chet tili (Saidkarimova O)");
        schedules.put("ATXK-B", atxkB);

        // =================================================================================
        // ATXK-C guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> atxkC = new LinkedHashMap<>();
        atxkC.put("Du", "<b>Dushanba (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Avtomobil tuzilishi (Qurbonov N)\n" +
                "2. 10:00-11:20: Tarbiya / Jismoniy tarbiya (O sarov O / Namazbayev A)\n" +
                "3. 11:30-12:50: Chet tili (Saidkarimova O)");
        atxkC.put("Se", "<b>Seshanba (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Informatika va axbor / Biznes asoslari (Tangirov Sh / Tojiboyev S)\n" +
                "2. 10:00-11:20: Chet tili (Saidkarimova O)\n" +
                "3. 11:30-12:50: Yo'l harakati qoidal (Xaydarov D)");
        atxkC.put("Ch", "<b>Chorshanba (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Avtomobil elektr va (Qurbonov N)\n" +
                "2. 10:00-11:20: Matematika (Karimjonov A)\n" +
                "3. 11:30-12:50: Informatika va axbor (Tangirov Sh)\n" +
                "4. 13:00-14:20: Mehnat muhofazasi va / Avtomobil elektr va (Qurbonov N / Qurbonov N)");
        atxkC.put("Pa", "<b>Payshanba (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Yo'l harakati qoidal (Xaydarov D)\n" +
                "2. 10:00-11:20: Chet tili (Saidkarimova O)\n" +
                "3. 11:30-12:50: Tarix (Sultanbekova U)");
        atxkC.put("Ju", "<b>Juma (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Yo'l harakati qoidal (Xaydarov D)\n" +
                "2. 10:00-11:20: Ona tili va adabiyot (Berdikulova A)\n" +
                "3. 11:30-12:50: Matematika (Karimjonov A)");
        atxkC.put("Sh", "<b>Shanba (ATXK-C):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Saidkarimova O)\n" +
                "2. 10:00-11:20: Avtomobil tuzilishi (Qurbonov N)\n" +
                "3. 11:30-12:50: Avtomobil dvigatella (Qurbonov N)");
        schedules.put("ATXK-C", atxkC);

        // =================================================================================
        // KTD-A guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> ktdA = new LinkedHashMap<>();
        ktdA.put("Du", "<b>Dushanba (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Tarix (Sultanbekova U)\n" +
                "2. 10:00-11:20: Axborot texnologiyal / Ma'lumotlar bazasi (Tangirov Sh / Tangirov Sh)\n" +
                "3. 11:30-12:50: Ona tili va adabiyot (Berdikulova A)");
        ktdA.put("Se", "<b>Seshanba (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Matematika (Karimjonov A)\n" +
                "2. 10:00-11:20: Chet tili (Djo`rayeva M)\n" +
                "3. 11:30-12:50: Dasturlashtirish til (Tangirov Sh)");
        ktdA.put("Ch", "<b>Chorshanba (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Dasturlash asoslari (Namazbayev A)\n" +
                "3. 11:30-12:50: Tarbiya (O sarov O)");
        ktdA.put("Pa", "<b>Payshanba (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Informatika va axbor (Tursunbayeva N)\n" +
                "2. 10:00-11:20: Jismoniy tarbiya / Tarbiya (Namazbayev A / O sarov O)\n" +
                "3. 11:30-12:50: Axborot xavfsizligi (Tangirov Sh)");
        ktdA.put("Ju", "<b>Juma (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Axborot texnologiyal (Tangirov Sh)");
        ktdA.put("Sh", "<b>Shanba (KTD-A):</b>\n\n" +
                "1. 08:30-09:50: Mehnat muhofazasi va (Tangirov Sh)\n" +
                "2. 10:00-11:20: Chet tili (Djo`rayeva M)\n" +
                "3. 11:30-12:50: Matematika / Kino (Karimjonov A / Djo`rayeva M)\n" +
                "4. 13:00-14:20: Chet tili (Djo`rayeva M)");
        schedules.put("KTD-A", ktdA);

        // =================================================================================
        // KTD-B guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> ktdB = new LinkedHashMap<>();
        ktdB.put("Du", "<b>Dushanba (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Tarbiya / Jismoniy tarbiya (O sarov O / Namazbayev A)\n" +
                "2. 10:00-11:20: Tarix (Sultanbekova U)\n" +
                "3. 11:30-12:50: Dasturlash asoslari (Tangirov Sh)");
        ktdB.put("Se", "<b>Seshanba (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Dasturlashtirish til (Tangirov Sh)");
        ktdB.put("Ch", "<b>Chorshanba (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Axborot texnologiyal / Matematika (Tangirov Sh / Karimjonov A)\n" +
                "2. 10:00-11:20: Tarbiya (O sarov O)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)");
        ktdB.put("Pa", "<b>Payshanba (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Axborot texnologiyal (Tangirov Sh)\n" +
                "2. 10:00-11:20: Chet tili (Djo`rayeva M)\n" +
                "3. 11:30-12:50: Informatika va axbor (Tursunbayeva N)");
        ktdB.put("Ju", "<b>Juma (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Matematika (Karimjonov A)\n" +
                "2. 10:00-11:20: Axborot xavfsizligi (Tangirov Sh)\n" +
                "3. 11:30-12:50: Axborot xavfsizligi (Tangirov Sh)");
        ktdB.put("Sh", "<b>Shanba (KTD-B):</b>\n\n" +
                "1. 08:30-09:50: Ona tili va adabiyot (Berdikulova A)\n" +
                "2. 10:00-11:20: Mehnat muhofazasi va (Tangirov Sh)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)\n" +
                "4. 13:00-14:20: Ma'lumotlar bazasi / Kino (Tursunbekova M / Djo`rayeva M)");
        schedules.put("KTD-B", ktdB);

        // =================================================================================
        // AT guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> at = new LinkedHashMap<>();
        at.put("Du", "<b>Dushanba (AT):</b>\n\n" +
                "1. 08:30-09:50: Tuproq bonitirovkasi (Tursunbekova M)\n" +
                "2. 10:00-11:20: Jismoniy tarbiya (Namazbayev A)\n" +
                "3. 11:30-12:50: Jismoniy tarbiya (Xamraqulova Z)");
        at.put("Se", "<b>Seshanba (AT):</b>\n\n" +
                "1. 08:30-09:50: Biologiya (Ibragimov A)\n" +
                "2. 10:00-11:20: Informatika va axbor / Umumiy va qishloq xo (Tursunbekova M)\n" +
                "3. 11:30-12:50: Chet tili (Xamraqulova Z)");
        at.put("Ch", "<b>Chorshanba (AT):</b>\n\n" +
                "1. 08:30-09:50: Matematika / Tarbiya (Karimjonov A / O sarov O)\n" +
                "2. 10:00-11:20: Tuproqshunoslik va a (Tursunbekova M)\n" +
                "3. 11:30-12:50: Tuproqshunoslik va a (Xamraqulova Z)");
        at.put("Pa", "<b>Payshanba (AT):</b>\n\n" +
                "1. 08:30-09:50: O'simlikshunoslik / Kino (Tursunbekova M / Quronboyeva F)\n" +
                "2. 10:00-11:20: Tuproqshunoslik va a (Tursunbekova M)\n" +
                "3. 11:30-12:50: Ona tili va adabiyot (Berdikulova A)\n" +
                "4. 13:00-14:20: Informatika va axbor (Tursunbayeva N)");
        at.put("Ju", "<b>Juma (AT):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Xamraqulova Z)\n" +
                "2. 10:00-11:20: Tarbiya (O sarov O)\n" +
                "3. 11:30-12:50: Chet tili (Quronboyeva F)");
        at.put("Sh", "<b>Shanba (AT):</b>\n\n" +
                "1. 08:30-09:50: Tarix (Sultanbekova U)\n" +
                "2. 10:00-11:20: Matematika (Karimjonov A)\n" +
                "3. 11:30-12:50: Chet tili (Xamraqulova Z)");
        schedules.put("AT", at);

        // =================================================================================
        // TCH guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> tch = new LinkedHashMap<>();
        tch.put("Du", "<b>Dushanba (TCH):</b>\n\n" +
                "1. 08:30-09:50: Matematika (Karimjonov A)\n" +
                "2. 10:00-11:20: Chet tili (Djo`rayeva M)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)\n" +
                "4. 13:00-14:20: Ayollar kiyimini kon /");
        tch.put("Se", "<b>Seshanba (TCH):</b>\n\n" +
                "1. 08:30-09:50: Informatika va axbor / Jismoniy tarbiya (Tursunbayeva N / Namazbayev A)\n" +
                "2. 10:00-11:20: Ona tili va adabiyot (Berdikulova A)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)");
        tch.put("Ch", "<b>Chorshanba (TCH):</b>\n\n" +
                "1. 08:30-09:50: Tikuvchilik texnolog (Rasmanova O)\n" +
                "2. 10:00-11:20: Kimyo (Quronboyeva F)\n" +
                "3. 11:30-12:50: Tarix (Sultanbekova U)");
        tch.put("Pa", "<b>Payshanba (TCH):</b>\n\n" +
                "1. 08:30-09:50: Tikuvchilik texnolog (Rasmanova O)\n" +
                "2. 10:00-11:20: Informatika va axbor (Tursunbayeva N)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)");
        tch.put("Ju", "<b>Juma (TCH):</b>\n\n" +
                "1. 08:30-09:50: Tikuvchilik material (Rasmanova O)\n" +
                "2. 10:00-11:20: Tikuvchilik material (Rasmanova O)\n" +
                "3. 11:30-12:50: Matematika (Karimjonov A)");
        tch.put("Sh", "<b>Shanba (TCH):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Maxsus rasm (Rasmanova O)\n" +
                "3. 11:30-12:50: Mehnat muhofazasi va (Rasmanova O)");
        schedules.put("TCH", tch);

        // =================================================================================
        // EM guruhi uchun dars jadvali
        // =================================================================================
        Map<String, String> em = new LinkedHashMap<>();
        em.put("Du", "<b>Dushanba (EM):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Matematika (Karimjonov A)\n" +
                "3. 11:30-12:50: Tarix (Sultanbekova U)");
        em.put("Se", "<b>Seshanba (EM):</b>\n\n" +
                "1. 08:30-09:50: Ona tili va adabiyot (Berdikulova A)\n" +
                "2. 10:00-11:20: Elektrotexnika va el / Informatika va axbor (18-o`qit. / Tursunbayeva N)\n" +
                "3. 11:30-12:50: Chet tili (Djo`rayeva M)");
        em.put("Ch", "<b>Chorshanba (EM):</b>\n\n" +
                "1. 08:30-09:50: Kimyo (Quronboyeva F)\n" +
                "2. 10:00-11:20: Chet tili (Djo`rayeva M)");
        em.put("Pa", "<b>Payshanba (EM):</b>\n\n" +
                "1. 08:30-09:50: Chet tili (Djo`rayeva M)\n" +
                "2. 10:00-11:20: Matematika (Karimjonov A)\n" +
                "3. 11:30-12:50: Jismoniy tarbiya / (Namazbayev A)\n" +
                "4. 13:00-14:20: Chet tili (Djo`rayeva M)");
        em.put("Ju", "<b>Juma (EM):</b>\n\n" +
                "1. 08:30-09:50: Elektr o'lchash as (18-o`qit.)\n" +
                "2. 10:00-11:20: Elektrotexnika va el (18-o`qit.)");
        em.put("Sh", "<b>Shanba (EM):</b>\n\n" +
                "1. 08:30-09:50: Texnikaviy chizmach (18-o`qit.)\n" +
                "2. 10:00-11:20: Elektrotexnik materi (18-o`qit.)");
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