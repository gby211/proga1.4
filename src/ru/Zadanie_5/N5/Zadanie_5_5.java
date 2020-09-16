package ru.Zadanie_5.N5;

import java.util.Scanner;

public class Zadanie_5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println(rek(a));
    }

    public static int rek(int a) {
        if (a < 10) {   // Базовый случай
            return a;
        } else {   // Шаг рекурсии
            return a % 10 + rek(a / 10);
        }
    }
}
