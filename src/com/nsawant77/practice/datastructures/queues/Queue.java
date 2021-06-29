package com.nsawant77.practice.datastructures.queues;

public class Queue {

    int[]queue = new int[5];
    int front;
    int rear;
    int size;

    public void enqueue(int c){
        queue[rear] = c;
        rear++;
        size++;
    }

    public int dequeue(){
        int no;
        no = queue[front];
        front++;
        size--;
        return no;
    }

    public void show(){
        for(int q: queue)
            System.out.print(q+" ");
        System.out.println();
}
}
