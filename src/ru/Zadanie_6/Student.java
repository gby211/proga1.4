package ru.Zadanie_6;

public class Student implements Comparator{
    protected int grade;
    protected int id;

    public Student(){
        this.grade = 2 + (int)(Math.random() * 4);
        this.id = 1000 + (int)(Math.random() * 9000);
    }

    @Override
    public int compareTo(Student ob) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade
                + ", id=" + id +'}';
    }
}