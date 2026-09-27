package com.tecspeak.collection.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedlistSimpleTest {
    @Test
    void testSearchElement(){
        LinkedListSimple listSimple =new LinkedListSimple();
        listSimple.add(12);
        listSimple.add(54);
        listSimple.add(75);
        assertTrue(listSimple.search(12));
    }

}
