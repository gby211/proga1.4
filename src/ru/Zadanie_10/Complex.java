package ru.Zadanie_10;

public class Complex {
    private int real;
    private int imaginary;

    Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }
}