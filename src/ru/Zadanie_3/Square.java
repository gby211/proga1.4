package ru.Zadanie_3;

public class Square extends Rectangle {
    public Square (){
        this.width = 1;
        this.length = 1;
        this.color = "black";
        this.filled = false;

    }
    public Square(double side){
        this.width = side;
        this.length = side;
        this.color = "black";
        this.filled = false;

    }
    public Square(double side ,String color,boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
