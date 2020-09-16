package ru.Zadanie_5.N4;

import java.util.Scanner;

public class Zadanie_5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println(rek(a));
    }
    public static int rek(int a){
        if (a<10){
            return a;
        }
        else {
            return a%10+rek(a /10);
        }
    }
}
