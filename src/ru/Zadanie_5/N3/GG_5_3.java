package ru.Zadanie_5.N3;

public class GG_5_3 {
    public static String recursion(int a, int b) {

        if (a > b) {

            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }
}

