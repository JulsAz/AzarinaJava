package com.company;

import java.util.Scanner;

public class Task1 {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”

    static int rightNumber = 7;

    public static void tapNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        int number = scanner.nextInt();

        if (number > rightNumber) {
            System.out.println("Привет");
        }
    }
}
