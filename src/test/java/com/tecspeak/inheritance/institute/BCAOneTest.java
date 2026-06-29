package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BCAOneTest {

    @Test
    public void testGetToatalMark(){
        BCAOne student=new BCAOne("Dnyane",1,
                50,60,70,
                48,49,45);
        double total=student.getTotalMarks();
     assertEquals(322,total);

    }
    @Test
    public void testTotalMark(){
        BCAOne student= new BCAOne("Dnyaneshwwar",103,
                56,76,94,
                35,57,78);
        double totalMark=student.getTotalMarks();
        assertEquals(396,totalMark);


    }


}
