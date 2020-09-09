package ru.zadanie_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author Andrey = new Author("Andrey","alex@yandex.ru",'M');
        Author unknown = new Author("unknown","123@goooglee.com");
        Author  Joanne_Rowling =new Author("Joanne Rowling","jkrowling",'F');
        Joanne_Rowling.setEmail("jkrowling@google.com");
        System.out.println(Andrey.toString());
        System.out.println(unknown.toString());
        System.out.println(Joanne_Rowling.toString());

    }
}
