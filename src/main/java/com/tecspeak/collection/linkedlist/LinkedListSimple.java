package com.tecspeak.collection.linkedlist;

class Node{
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSimple {
    Node head;
    void add(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
        }else {
            Node current =head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }

    }
    void display(){
        Node current =head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkedListSimple list=new LinkedListSimple();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}
