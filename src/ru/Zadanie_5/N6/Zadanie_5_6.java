package ru.Zadanie_5.N6;

import java.util.Scanner;

public class Zadanie_5_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите простое число");
        int a = in.nextInt();
        System.out.println(rek6(a,2));
    }
    public static boolean rek6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return rek6(n, i + 1);
        } else {
            return true;
        }
    }
}
