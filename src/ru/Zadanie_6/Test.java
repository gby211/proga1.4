package ru.Zadanie_6;

public class Test {

    public static void printList(Student[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
        System.out.println("");
    }

    public static void createIdList(Student[] list) {
        for (int i = 0; i < list.length; i++)
            list[i] = new Comparator_comparison_down();
    }

    public static void createMarkList(Student[] list) {
        for (int i = 0; i < list.length; i++)
            list[i] = new Comparator_grade();
    }

    public static void main(String[] args) {
        Student[] studentList = new Student[5];


        // Упражнение 1.
        createIdList(studentList);
        printList(studentList);
        sort.insertionSort(studentList);
        printList(studentList);


        //Упражнение 2.
        createMarkList(studentList);
        printList(studentList);
        sort.quickSort(studentList, 0, studentList.length - 1);
        printList(studentList);

        //Упражнение 3.
        Student[] studentList1 = new Student[10];
        Student[] studentList2 = new Student[10];
        createIdList(studentList1);
        createIdList(studentList2);
        printList(studentList1);
        printList(studentList2);
        sort.mergeSort(studentList1, 0, studentList.length - 1);
        sort.mergeSort(studentList2, 0, studentList.length - 1);
        printList(studentList1);
        printList(studentList2);
        Student[] studentList3 = sort.mergeLists(studentList1, studentList2); //итоговый массив
        printList(studentList3);
    }
}