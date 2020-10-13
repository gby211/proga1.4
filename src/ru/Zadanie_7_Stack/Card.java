package ru.Zadanie_7_Stack;

public class Card extends Game{
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
