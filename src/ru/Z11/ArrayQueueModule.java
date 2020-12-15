package ru.Z11;

import java.util.Arrays;

public class ArrayQueueModule {
    // variables is static
    // all methods is static
    private static int size;
    private static Object[] elements = new Object[5];

    // | input  Object
    // | output void
    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }
    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    // | input  void
    // | output Object
    public static Object dequeue () {
        assert size > 0;
        Object value = peek();
        size--;
        System.arraycopy(elements, 1, elements, 0, size);
        return value;
    }
    // | input  void
    // | output Object
    public static Object peek() {
        assert size > 0;
        return elements[0];
    }
    // | input  void
    // | output int
    public static int size() {
        return size;
    }
    // | input  void
    // | output boolean
    public static boolean isEmpty() {
        return size == 0;
    }
    // | input  void
    // | output void
    public static void clear() {
        while(size != 0)
        {
            dequeue();
        }
    }
}