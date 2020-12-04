package ru.Zadanie_10_1;

public class Client {
    private static Chair chair;

    public static void sit(){
        System.out.println("Sitting on " + chair);
    }

    public static void setChair(Chair chaiir){
        chair = chaiir;
    }

    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        String chair_type = "Magic";    //тип стула. Изменить для тестов на Functional или Victorian
        if(chair_type.equals("Magic"))
            setChair(factory.createMagicChair());
        else if(chair_type.equals("Functional"))
            setChair(factory.createFunctionalChair());
        else if(chair_type.equals("Victorian"))
            setChair(factory.createVictorianChair());

        sit();
    }
}