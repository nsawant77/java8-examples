package com.nsawant77.practice.datastructures.stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(1);
        stack.peek();
        stack.push(4);
        stack.push(17);
        stack.push(19);
        stack.pop();
        stack.show();

    }
}
