package com.nsawant77.practice.datastructures.queues;

public class QueueMain {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(17);
        queue.enqueue(14);
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(7);
        queue.show();
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");
        System.out.print(queue.dequeue() + " ");

    }
}
