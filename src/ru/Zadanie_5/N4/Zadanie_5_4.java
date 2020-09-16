package ru.Zadanie_5.N4;

import java.util.Scanner;

public class Zadanie_5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа k и s");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(rek5(0,0,a,b));
    }

    public static int rek5(int a, int b, int k, int s) {
        // Базовый случай
        if (a == k) {
            if (b == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (a == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += rek5(a + 1, b + i, k, s);
        }
        return res;
    }

}

