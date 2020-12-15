package ru.Z11;

public class LinkedQueueTest {
    public static void fill(LinkedQueue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(LinkedQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " +
                    queue.element() + " " + queue.dequeue());
        }
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element());
    }
}