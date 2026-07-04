package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BCATwoTest {
    @Test
    public void getTotalMarks(){
        Student student=new BCATwo("Dnyane",204,
                93,90,87,78);

        double total= student.getTotalMarks();
        assertEquals(348,total);
    }
}
