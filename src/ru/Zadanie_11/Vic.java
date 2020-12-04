package ru.Zadanie_11;

class VictorianChair  implements Chair{
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Victorian Chair " + age + " age";
    }
}