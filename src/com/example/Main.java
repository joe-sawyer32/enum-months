package com.example;

import com.example.common.Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("------------------------");
            System.out.print("Please choose a month (All Caps Please): ");
            System.out.printf("\nSelected month: %s\n", Month.valueOf(scanner.nextLine()).getEnglishName());

        } catch (IllegalArgumentException ex) {
            System.out.println("\nThis is not a valid month (or is not in the correct format).");
        }

    }
}
