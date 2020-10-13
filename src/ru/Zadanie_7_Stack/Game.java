package ru.Zadanie_7_Stack;

import java.util.Stack;

public class Game extends  Coloda{
    public int gammme (Stack DeckP1,Stack DeckP2,int max_iteration,int iteration_now){
        while (iteration_now<max_iteration&&win(DeckP1,DeckP2)){
            Card first_card = (Card) DeckP1.pop();
            Card second_card = (Card) DeckP2.pop();
            if (first_card.getValue()>second_card.getValue()&&zero_nine(first_card.getValue(),second_card.getValue())){
                Stack<Card> inversion_deckI = new Stack<>();
                inversion_deckI = inversion_deck(DeckP1);
                inversion_deckI.push(first_card);
                inversion_deckI.push(second_card);
                inversion_deckI = inversion_deck(inversion_deckI);
                System.out.println("перв"+inversion_deckI);
                DeckP1 = (Stack<Card>) inversion_deckI.clone();
                iteration_now++;
            }
            else{
                Stack<Card> inversion_deckI = new Stack<>();
                inversion_deckI = inversion_deck(DeckP2);
                inversion_deckI.push(first_card);
                inversion_deckI.push(second_card);
                inversion_deckI = inversion_deck(inversion_deckI);
                System.out.println("втора"+inversion_deckI);
                DeckP2 = (Stack<Card>) inversion_deckI.clone();
                iteration_now++;
            }
        }
        return iteration_now;
    }
    public boolean win (Stack DeckP1,Stack DeckP2){
        return !DeckP1.empty() && !DeckP2.empty();
    }
    public boolean zero_nine(int first,int second){
        if (first==9 && second ==0){
            return false;
        }
        else return true;
    }
    public String Who_did_win(Stack first,Stack second){
        if (win(first,second)){
            if (first.empty()){
                return "second";
            }
            else return "first";
        }
        else return "botva";
    }

    @Override
    public Stack<Card> getDeckP1() {
        return super.getDeckP1();
    }

    @Override
    public Stack<Card> getDeckP2() {
        return super.getDeckP2();
    }
}

