package com.tecspeak.collection.linkedlist;


class Nodes{
    Nodes next;
    Students data;

    public Nodes(Students data) {
        this.data = data;
        this.next = null;
    }
}
public class StudentInfoLinkedlist {

    Nodes head;
    void add(Students data) {

        Nodes newnode = new Nodes(data);

        if (head == null) {
            head = newnode;
        } else {

            Nodes current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newnode;
        }
    }

    void display() {

        Nodes current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    boolean search(Students data) {

        Nodes current = head;

        while (current != null) {

            if (data.equals(current.data)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        StudentInfoLinkedlist list =new StudentInfoLinkedlist();

        Students s1 = new Students(101, "Vijay", "MCA");
        Students s2 = new Students(102, "Rahul", "BCA");
        Students s3 = new Students(103, "Pratik", "MCA");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.display();

        System.out.println(list.search(s2));
    }
}
