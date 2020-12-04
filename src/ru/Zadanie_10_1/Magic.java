package ru.Zadanie_10_1;

class MagicChair  implements Chair{
    public void doMagic(){
        System.out.println("Magic!");
    }

    public MagicChair(){
        doMagic();
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }
}