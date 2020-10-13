package ru1.Calssss;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zadanie_7_Queue {
    public static void main(String[] args) {
        Queue<Integer> DeckP1 = new LinkedList<>();
        Queue<Integer> DeckP2 = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5 чисел первого игрока(числа от \"0\" до \"9\").");
        for (int i = 0; i < 5; i++) {                                                                  // скан карт первого игрока
            int number = scan.nextInt();
            DeckP1.add(number);
        }
        System.out.println("Введите 5 чисел второго игрока(числа от \"0\" до \"9\").");
        for (int i = 0; i < 5; i++) {                                                                  // скан карт второго игрока
            int number = scan.nextInt();
            DeckP2.add(number);
        }
        //DeckP1.add(1);
        //DeckP1.add(3);
        //DeckP1.add(5);
        //DeckP1.add(7);
        //DeckP1.add(9);
//
        //DeckP2.add(2);
        //DeckP2.add(4);
        //DeckP2.add(6);
        //DeckP2.add(8);
        //DeckP2.add(0);
        int iteration = 0;

        //System.out.println(DeckP1);
        //System.out.println(DeckP2);
        //System.out.println(DeckP1.element());
        //System.out.println(DeckP1.element());
        //System.out.println(DeckP1.element());
        //System.out.println(DeckP1);
        //System.out.println(DeckP1.poll());
        //System.out.println(DeckP1);
        //System.out.println(DeckP1.add(1));
        //System.out.println(DeckP1);

        while (iteration < 160 && !DeckP1.isEmpty() && !DeckP2.isEmpty()) {
            int first,second;
            if (DeckP1.peek()>DeckP2.peek()){
                if(DeckP1.peek()==9&&DeckP2.peek()==0){
                    first=DeckP1.remove();
                    second=DeckP2.remove();
                    DeckP2.add(first);
                    DeckP2.add(second);
                    iteration++;
                    continue;
                }
                first=DeckP1.remove();
                second=DeckP2.remove();
                DeckP1.add(first);
                DeckP1.add(second);
                iteration++;
            }
            else {
                if(DeckP1.peek()==0&&DeckP2.peek()==9){
                    first=DeckP1.remove();
                    second=DeckP2.remove();
                    DeckP1.add(first);
                    DeckP1.add(second);
                    iteration++;
                    continue;
                }
                first=DeckP1.remove();
                second=DeckP2.remove();
                DeckP2.add(first);
                DeckP2.add(second);
                iteration++;
            }

        }
        if (DeckP1.isEmpty()) {
            System.out.println("second " + iteration);
        } else if (DeckP2.isEmpty()) {
            System.out.println("first " + iteration);
        } else System.out.println("botva");
    }
}

