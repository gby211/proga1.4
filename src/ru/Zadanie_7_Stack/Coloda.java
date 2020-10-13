package ru.Zadanie_7_Stack;

import java.util.Stack;
import java.util.Scanner;

public class Coloda {

    Stack<Card> DeckP1 = new Stack<>();
    Stack<Card> DeckP2 = new Stack<>();

    public void Auto_zap() {  // заполнение стака автоматически
        //DeckP1.push(new Card(1));
        //DeckP1.push(new Card(2));
        //DeckP1.push(new Card(3));
        //DeckP1.push(new Card(4));
        //DeckP1.push(new Card(5));
        //DeckP2.push(new Card(6));
        //DeckP2.push(new Card(7));
        //DeckP2.push(new Card(8));
        //DeckP2.push(new Card(9));
        //DeckP2.push(new Card(0));

        DeckP1.push(new Card(1));
        DeckP1.push(new Card(3));
        DeckP1.push(new Card(5));
        DeckP1.push(new Card(7));
        DeckP1.push(new Card(9));
        DeckP2.push(new Card(2));
        DeckP2.push(new Card(4));
        DeckP2.push(new Card(5));
        DeckP2.push(new Card(8));
        DeckP2.push(new Card(0));
    }

    public void Zap_rukami() {      // заполнение стака вручную
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5 чисел первого игрока(числа от \"0\" до \"9\").");
        for (int i = 0; i < 5; i++) {                                                                  // скан карт первого игрока
            int number = scan.nextInt();
            DeckP1.push(new Card(number));
        }
        System.out.println("Введите 5 чисел второго игрока(числа от \"0\" до \"9\").");
        for (int i = 0; i < 5; i++) {                                                                  // скан карт второго игрока
            int number = scan.nextInt();
            DeckP2.push(new Card(number));
        }
    }

    public Stack<Card> inversion_deck(Stack deck) {
        Stack<Card> inversion_stack = new Stack<>();
        Stack<Card> clone_stack = (Stack<Card>) deck.clone();
        int max = clone_stack.size();
        for (int i = 0; i < max; i++) {
            inversion_stack.push(clone_stack.pop());
        }
        return inversion_stack;
    }

    public Stack<Card> getDeckP1() {
        return DeckP1;
    }

    public Stack<Card> getDeckP2() {
        return DeckP2;
    }
}