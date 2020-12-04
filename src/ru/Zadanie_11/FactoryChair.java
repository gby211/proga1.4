package ru.Zadanie_11;

class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair((int)(Math.random()*100));
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}