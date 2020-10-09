package ru.Zadanie_6;

import java.util.Arrays;

public class sort {
    public static void insertionSort(Student[] list){
        for (int index = 0; index < list.length; index++) {
            Student value = list[index];
            int i = index - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(list[i]) < 0) {
                    list[i + 1] = list[i];
                } else {
                    break;
                }
            }
            list[i + 1] = value;
        }
    }

    public static void quickSort(Student[] list, int leftIndex, int rightIndex) {
        int leftMarker = leftIndex;
        int rightMarker = rightIndex;
        Student index = list[(leftMarker + rightMarker) / 2];
        do {
            while (list[leftMarker].compareTo(index) < 0) {
                leftMarker++;
            }
            while (list[rightMarker].compareTo(index) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = list[leftMarker];
                    list[leftMarker] = list[rightMarker];
                    list[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightIndex) {
            quickSort(list, leftMarker, rightIndex);
        }
        if (leftIndex < rightMarker) {
            quickSort(list, leftIndex, rightMarker);
        }
    }

    public static void mergeSort(Student[] list, int leftIndex, int rightIndex) {

        if (rightIndex <= leftIndex)
            return;
        int mid = leftIndex + (rightIndex - leftIndex) / 2;
        mergeSort(list, leftIndex, mid);
        mergeSort(list, mid + 1, rightIndex);

        Student[] buf = Arrays.copyOf(list, list.length);

        for (int k = leftIndex; k <= rightIndex; k++)
            buf[k] = list[k];

        int i = leftIndex, j = mid + 1;
        for (int k = leftIndex; k <= rightIndex; k++) {

            if (i > mid) {
                list[k] = buf[j];
                j++;
            } else if (j > rightIndex) {
                list[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                list[k] = buf[j];
                j++;
            } else {
                list[k] = buf[i];
                i++;
            }
        }
    }

    public static Student[] mergeLists(Student[] list1, Student[] list2) {
        Student[] result = new Student[list1.length + list2.length];

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex + rightIndex < result.length) {
            if (rightIndex == list2.length || leftIndex != list1.length
                    && list1[leftIndex].compareTo(list2[rightIndex]) < 0) {
                result[leftIndex + rightIndex] = list1[leftIndex++];
            } else {
                result[leftIndex + rightIndex] = list2[rightIndex++];
            }
        }
        return result;
    }
}
