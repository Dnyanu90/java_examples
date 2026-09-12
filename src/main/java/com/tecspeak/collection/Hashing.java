package com.tecspeak.collection;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set =new HashSet<>();

        // Insert
        set.add(12);
        set.add(12);
        set.add(13);
        set.add(14);

        // Print all element
        System.out.println(set);

        // Search -contains
        if (set.contains(12)){
            System.out.println("Set Contain 12");
        }
        if (!set.contains(6)){
            System.out.println("does not contain");
        }
        // delete
        set.remove(12);
        if (!set.contains(12)){
            System.out.println("does not contain 12 - we delete 12");
        }

        //size
        System.out.println("size of set: "+set.size());

        // Iterator


    }
}
