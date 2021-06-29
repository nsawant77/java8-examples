package com.nsawant77.practice.datastructures.linkedlist;

public class LinkedListDemo {

    Node head;                                      //12, 7, 9, 16!null
                                                    //12!null
                                                    //add(11)

    static class Node {
        int data;
        Node next;
    }

    public void add(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){                          //12,17,14
            head = node;
        }
        else {
            Node n =  head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
