package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        System.out.println("------------------------");
        System.out.print("Please choose a month (All Caps Please): ");
        try (Scanner scanner = new Scanner(System.in)) {
            Month userMonth = Month.valueOf(scanner.nextLine());
            System.out.printf("\nSelected month: %s\n", userMonth.getEnglishName());
            List<String> userMonthAndBeyond= new ArrayList<>();
            switch (userMonth) {
                case JANUARY: userMonthAndBeyond.add(Month.JANUARY.getEnglishName());
                case FEBRUARY: userMonthAndBeyond.add(Month.FEBRUARY.getEnglishName());
                case MARCH: userMonthAndBeyond.add(Month.MARCH.getEnglishName());
                case APRIL: userMonthAndBeyond.add(Month.APRIL.getEnglishName());
                case MAY: userMonthAndBeyond.add(Month.MAY.getEnglishName());
                case JUNE: userMonthAndBeyond.add(Month.JUNE.getEnglishName());
                case JULY: userMonthAndBeyond.add(Month.JULY.getEnglishName());
                case AUGUST: userMonthAndBeyond.add(Month.AUGUST.getEnglishName());
                case SEPTEMBER: userMonthAndBeyond.add(Month.SEPTEMBER.getEnglishName());
                case OCTOBER: userMonthAndBeyond.add(Month.OCTOBER.getEnglishName());
                case NOVEMBER: userMonthAndBeyond.add(Month.NOVEMBER.getEnglishName());
                case DECEMBER: userMonthAndBeyond.add(Month.DECEMBER.getEnglishName());
                break;
            }
            System.out.println("Here's a look at the rest of the year:");
            System.out.println(userMonthAndBeyond);
        } catch (IllegalArgumentException ex) {
            System.out.println("\nThis is not a valid month (or is not in the correct format).");
            System.out.println(ex);
        }

    }
}
