package com.example;

import com.example.common.Month;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        outputOptions();
        Month userMonth = null;
        boolean isValidInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------------------");
            System.out.print("Please choose a month (All Caps Please): ");
            try {
                userMonth = Month.valueOf(scanner.nextLine());
                isValidInput = true;
            } catch (IllegalArgumentException ex) {
                System.out.println("\nThis is not a valid month (or is not in the correct format).");
                System.out.println("Error Message: " + ex);
            }
        } while (!isValidInput);
        System.out.printf("\nSelected month: %s\n", userMonth.getEnglishName());
        List<String> userMonthAndBeyond = new ArrayList<>();
        userMonthAndBeyond = createMonthList(userMonth, userMonthAndBeyond);
        System.out.println("Here's a look at the rest of the year:");
        System.out.println(userMonthAndBeyond);

        // EXTRA
        writeMonthToJson(userMonth);
    }

    private static void writeMonthToJson(Month month) {
        ObjectMapper mapper = new ObjectMapper();
        try (FileWriter fileWriter = new FileWriter("month.json")){
            String json = mapper.writeValueAsString(month);
            fileWriter.write(json);
        } catch (JsonProcessingException ex) {
            System.out.println("Error in JSON Processing");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error in file writing");
            ex.printStackTrace();
        }
    }

    private static List<String> createMonthList(Month month, List<String> list) {
        switch (month) {
            case JANUARY: list.add(Month.JANUARY.getEnglishName());
            case FEBRUARY: list.add(Month.FEBRUARY.getEnglishName());
            case MARCH: list.add(Month.MARCH.getEnglishName());
            case APRIL: list.add(Month.APRIL.getEnglishName());
            case MAY: list.add(Month.MAY.getEnglishName());
            case JUNE: list.add(Month.JUNE.getEnglishName());
            case JULY: list.add(Month.JULY.getEnglishName());
            case AUGUST: list.add(Month.AUGUST.getEnglishName());
            case SEPTEMBER: list.add(Month.SEPTEMBER.getEnglishName());
            case OCTOBER: list.add(Month.OCTOBER.getEnglishName());
            case NOVEMBER: list.add(Month.NOVEMBER.getEnglishName());
            case DECEMBER: list.add(Month.DECEMBER.getEnglishName());
                break;
        }
        return list;
    }

    private static void outputOptions() {
        for (Month m : Month.values()) {
            System.out.println(m);
        }
    }
}
