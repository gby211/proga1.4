package ru.Z11;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[5];

    // | input element
    // | output void
    public void enqueue(Object element){
        ensureCapacity(size + 1);
        elements[size++] = element;
    }
    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    // | input void
    // | output Object
    public Object dequeue (){
        assert size > 0;
        Object value = element();
        size--;
        System.arraycopy(elements, 1, elements, 0, size);
        return value;
    }

    // | input void
    // | output Object
    public Object element ()
    {
        assert size > 0;
        return elements[0];
    }
    // | input void
    // | output int
    public int size(){
        return size;
    }
    // | input void
    // | output boolean
    public boolean isEmpty(){
        return size == 0;
    }
    // | input void
    // | output void
    public void clear(){
        while(size != 0)
        {
            this.dequeue();
        }
    }
}