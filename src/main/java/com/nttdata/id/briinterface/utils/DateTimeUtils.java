package com.nttdata.id.briinterface.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeUtils {

    public static String convertDateTimeFormat(String originalDateTime) {
        if (originalDateTime == null || originalDateTime.isEmpty()) {
            return "";
        } else {
            // Build a flexible DateTimeFormatter to handle fractional seconds with 1 to 9 digits
            DateTimeFormatter inputFormatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm:ss")
                .optionalStart()
                .appendFraction(ChronoField.MILLI_OF_SECOND, 1, 9, true)
                .optionalEnd()
                .toFormatter();

            // Parse the timestamp from the database with the flexible formatter
            LocalDateTime dateTime = LocalDateTime.parse(originalDateTime, inputFormatter);

            // Format the parsed LocalDateTime into the desired format
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss.SSSSSS");
            return dateTime.format(outputFormatter);
        }
    }

    public static Date convertDateFormat(Date originalDate){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = formatter.format(originalDate);
        Date newDate = null;
        try {
            newDate = formatter.parse(formattedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("New Date: " + newDate);
        return newDate;
    }

}

