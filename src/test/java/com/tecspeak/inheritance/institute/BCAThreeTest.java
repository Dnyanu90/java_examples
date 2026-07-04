package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BCAThreeTest {
    @Test
    public void getMarkTest(){
        Student student=new BCAThree("Dnyane",239,
                96,91,95);

        double total=student.getTotalMarks();
        assertEquals(282,total);


    }
}
