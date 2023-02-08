package com.company;

import java.util.Scanner;

public class Task2 {
    //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

    static String rightName = "Вячеслав";

    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");

        String name = scanner.nextLine();
        if (name.equals(rightName)) {
            System.out.println("Привет, " + rightName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
