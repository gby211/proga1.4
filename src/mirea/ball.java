package mirea;

public class ball {
    private String color;
    private String type;
    private int prise;


    public ball() {
        color = "null";
        type = "null";
        prise = 0;
    }

    public ball(String n) {
        color = n;
        type = "null";
        prise = 0;

    }

    public ball(String n, String b) {
        color = n;
        type = b;
        prise = 0;

    }

    public ball(String n, String b, int a) {
        color = n;
        type = b;
        prise = a;

    }

    public int getPrise() {
        return prise;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ball{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", prise=" + prise +
                '}';
    }

    public void info() {
        System.out.println("Type - " + type +
                " Color - " + color +
                " Prise - " + prise);
    }
}
