package ru.Zadanie_6;

public class Comparator_grade extends Student implements Comparator{

    //сравнивание студентов по их оценке
    @Override
    public int compareTo(Student ob) {
        if(this.grade < ob.grade)
            return -1;
        else if(this.grade > ob.grade)
            return 1;
        else
            return 0;
    }
}