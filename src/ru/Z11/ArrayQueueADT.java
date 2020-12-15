package ru.Z11;

import java.util.Arrays;

public class ArrayQueueADT {

    // variables isn't static,
    //whereas methods is static
    private int size;
    private Object[] elements = new Object[5];

    // | input class instance, Object
    // | output void
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.size++] = element;
    }
    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            queue.elements = Arrays.copyOf(queue.elements, 2 * capacity);
        }
    }
    // | input class instance
    // | output Object
    public static Object dequeue (ArrayQueueADT queue) {
        assert queue.size > 0;
        Object value = peek(queue);
        queue.size--;
        System.arraycopy(queue.elements, 1, queue.elements, 0, queue.size );
        return value;
    }
    // | input class instance
    // | output Object
    public static Object peek(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[0];
    }
    // | input class instance
    // | output int
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // | input class instance
    // | output boolean
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // | input class instance
    // | output void
    public static void clear(ArrayQueueADT queue) {
        while(queue.size != 0)
        {
            dequeue(queue);
        }
    }
}