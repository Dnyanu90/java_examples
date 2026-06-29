package com.tecspeak.math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathOpsTest {
    @Test
    public void  add(){
        assertEquals(10, MathOps.add(4,6));
        assertEquals(50,1,49);
    }
    @Test
    public void sub(){
        assertEquals(10, MathOps.sub(20,10));
        assertEquals(12, MathOps.sub(14,2));
        assertNotEquals(12, MathOps.sub(23,56));
    }
    @Test
    public void mul(){
        assertEquals(20, MathOps.mul(2,10));

    }
    @Test
    public void div(){
        assertEquals(2 , MathOps.div(10,5));
    }
    @Test
    public void mod(){
        assertEquals(1, MathOps.mod(5,2));
    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            MathOps.div(3, 0);
        });
    }



}