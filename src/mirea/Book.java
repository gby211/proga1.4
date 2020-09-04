package mirea;

public class Book {
    private String name;
    private String genre;
    private int edition;
    private int prise;


    public Book() {
        name = "null";
        genre = "null";
        edition = 0;
        prise = 0;
    }

    public Book(String n) {
        name = n;
        genre = "null";
        edition = 0;
        prise = 0;

    }

    public Book(String n, String b) {
        name = n;
        genre = b;
        edition = 0;
        prise = 0;
    }

    public Book(String n, String b, int a) {
        name = n;
        genre = b;
        edition = a;
        prise = 0;

    }
    public Book(String n, String b, int a,int c) {
        name = n;
        genre = b;
        edition = a;
        prise = c;

    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book { " +
                "name = ' " + name + '\'' +
                ", genre = ' " + genre + '\'' +
                ", edition = " + edition +
                ", prise = " + prise +
                '}';
    }

    public void info() {
        System.out.println("Name - " + name +
                " Name - " + name +
                " Edition - " + edition +
                " Prise - "+prise);
    }
}