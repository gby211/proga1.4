package mirea;

public class TestBook {
    public static void main(String[] args) {
        Book first = new Book();
        Book second = new Book("Head First Java", "science", 7, 1500);
        Book third = new Book("Voina i Mir", "novel");
        third.setPrise(20000);
        System.out.println(second);
        first.info();
        second.info();
        third.info();

    }
}
