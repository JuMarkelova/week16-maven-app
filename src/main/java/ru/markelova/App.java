package ru.markelova;

import ru.markelova.entity.Day;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name of day or 'exit' to quit: ");
            try {
                String day = sc.nextLine();
                if (day.equals("exit")) {
                    break;
                } else {
                    System.out.println(Day.createFromEnglish(day).getRussianName());
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(Arrays.toString(ex.getStackTrace()));
                break;
            }
        }
        sc.close();
    }
}