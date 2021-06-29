package com.nsawant77.practice.datastructures.stack;

public class Stack {

    int[] nos = new int[5];
    int top = 0;

    public void push(int data) {
        nos[top] = data;
        top++;
    }

    public int pop() {
        int data;
        top--;
        data = nos[top];
        nos[top] = 0;
        return data;
    }

    public void peek() {
        System.out.println(nos[top - 1]);
    }

    public void show() {
        for (int n : nos)
            System.out.print(n+" ");
    }
}
