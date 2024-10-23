package com.basic;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParse {
   /* public static void main(String[] args) {
        // Example date-time string
        String dateTimeString = "2024-04-17 02:43:08.841000+00";

        // Define the DateTimeFormatter with the correct pattern
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSXXXXX");
        LocalDateTime localDateTime;
        try {
            // Parse the date-time string to OffsetDateTime
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString, dateTimeFormatter);
            // Convert to LocalDateTime
            localDateTime = offsetDateTime.toLocalDateTime();
        } catch (DateTimeParseException e) {
            localDateTime=LocalDateTime.now();
            //throw new IllegalArgumentException("Invalid date-time format: " + dateTimeString, e);
        }

        // Print the LocalDateTime
        System.out.println("Parsed LocalDateTime: " + localDateTime);
    }*/
    public static void main(String[] args) {
        // Example date-time string
        //String dateTimeString = "2024-04-17 02:43:08.841000+00";
        String dateTimeString = "2024-04-04 00:00:28.395181+00:00";

        // Normalize the offset to +00:00
        if (dateTimeString.endsWith("+00")) {
            dateTimeString = dateTimeString.replace("+00", "+00:00");
        }

        // Define the DateTimeFormatter with the correct pattern
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSXXXXX");
        LocalDateTime localDateTime;
        try {
            // Parse the date-time string to OffsetDateTime
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString, dateTimeFormatter);
            // Convert to LocalDateTime
            localDateTime = offsetDateTime.toLocalDateTime();
        } catch (DateTimeParseException e) {
            localDateTime=LocalDateTime.now();
            //throw new IllegalArgumentException("Invalid date-time format: " + dateTimeString, e);
        }

        // Print the LocalDateTime
        System.out.println("Parsed LocalDateTime: " + localDateTime);
    }
}
