package ru.Zadanie_5.N3;

import java.util.Scanner;

import static ru.Zadanie_5.N3.GG_5_3.recursion;

public class Zadanie_5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(recursion(a, b));

    }
}
