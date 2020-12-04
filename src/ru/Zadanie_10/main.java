package ru.Zadanie_10;

class MainTest {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        Complex complex2 = factory.createComplex(123, 321);
    }

}