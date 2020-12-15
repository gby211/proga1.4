package ru.Z11;

public class LinkedQueue {
    private int size;
    private Node head;
    private Node tail;
    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Object element) {
        Node oldLast = tail;
        tail = new Node();
        tail.value = element;
        tail.next = null;
        if (isEmpty())
            head = tail;
        else
            oldLast.next = tail;
        size++;
    }

    public Object dequeue() {
        assert size > 0;
        Object value = head.value;
        head = head.next;
        size--;
        if (isEmpty())
            tail = head;
        return value;
    }

    public Object element () {
        assert size > 0;
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear(){
        while(size != 0)
        {
            this.dequeue();
        }
    }

    private class Node {
        private Object value;
        private Node next;
    }
}