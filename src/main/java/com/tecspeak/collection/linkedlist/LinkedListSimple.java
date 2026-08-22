package com.tecspeak.collection.linkedlist;

class Node{
    Node next;
    Integer data;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSimple {
    Node head;
    void add(Integer data){
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
    boolean search(Integer data){
        Node current =head;
        while (current!=null){
            if (data==current.data){
                return true;
            }
            current=current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListSimple list=new LinkedListSimple();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        System.out.println(list.search(20));
    }
}
