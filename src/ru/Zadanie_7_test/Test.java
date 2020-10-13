package ru.Zadanie_7_test;

import ru.Zadanie_7_test.Card;

import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static Stack<Card> inversion_deck(Stack deck) {
        Stack<Card> inversion_stack = new Stack<>();
        Stack<Card> clone_stack = (Stack<Card>) deck.clone();
        int max = clone_stack.size();
        for (int i = 0; i < max; i++) {
            inversion_stack.push(clone_stack.pop());
        }
        return inversion_stack;
    }
    public static void main(String[] args) {


        Stack<Card> DeckP1 = new Stack<>();
        Stack<Card> DeckP2 = new Stack<>();

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

//        DeckP1.push(new Card(1));
//        DeckP1.push(new Card(3));
//        DeckP1.push(new Card(5));
//        DeckP1.push(new Card(7));
//        DeckP1.push(new Card(9));

//        DeckP2.push(new Card(2));
//        DeckP2.push(new Card(4));
//        DeckP2.push(new Card(6));
//        DeckP2.push(new Card(8));
//        DeckP2.push(new Card(0));

        int iteration =0;



        while (iteration<160&&!DeckP1.empty()&&!DeckP2.empty()){
            Card first_card = null;
            Card second_card = null;
            Stack<Card> inversion_deck_first = new Stack<>();
            Stack<Card> inversion_deck_second = new Stack<>();
            DeckP1 = inversion_deck(DeckP1);
            DeckP2 = inversion_deck(DeckP2);
            first_card = DeckP1.pop();
            second_card = DeckP2.pop();
            DeckP1 = inversion_deck(DeckP1);
            DeckP2 = inversion_deck(DeckP2);

            if (first_card.getValue()>second_card.getValue()){
                if (first_card.getValue()==9&&second_card.getValue()==0){
                    DeckP2.push(first_card);
                    DeckP2.push(second_card);
                    iteration++;
                    continue;
                }
                DeckP1.push(first_card);
                DeckP1.push(second_card);
                iteration++;
            }
            else{
                if (first_card.getValue()==0&&second_card.getValue()==9){
                    DeckP1.push(first_card);
                    DeckP1.push(second_card);
                    iteration++;
                    continue;
                }
                DeckP2.push(first_card);
                DeckP2.push(second_card);
                iteration++;
            }
        }
        if (DeckP1.empty()){
            System.out.println("second "+iteration);
        }
        else if (DeckP2.empty()){
            System.out.println("first "+iteration);
        }
        else System.out.println("botva");
    }
}
