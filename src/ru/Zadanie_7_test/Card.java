package ru.Zadanie_7_test;

import ru.Zadanie_7_Stack.Game;

public class Card  {
    private int value ;
    public Card(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value+"";
    }
}
