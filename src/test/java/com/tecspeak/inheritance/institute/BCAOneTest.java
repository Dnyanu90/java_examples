package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BCAOne}.
 *
 * @author TecSpeak
 */
public class BCAOneTest {

    /**
     * Tests the getTotalMarks() method for a BCAOne student.
     */
    @Test
    public void testGetToatalMark() {
        Student student = new BCAOne("Dnyane", 1,
                50, 60, 70,
                48, 49, 45);
        double total = student.getTotalMarks();
        assertEquals(322, total);
    }

    /**
     * Tests the getTotalMarks() method with a different set of marks.
     */
    @Test
    public void testTotalMark() {
        BCAOne student = new BCAOne("Dnyaneshwwar", 103,
                56, 76, 94,
                35, 57, 78);
        double totalMark = student.getTotalMarks();
        assertEquals(396, totalMark);
    }

    /**
     * Tests the getTotalMarks(outOfTotalMarks) method to verify percentage calculation.
     */
    @Test
    public void testGetToatalMarksPercentage() {
        BCAOne bcaOneStudent = new BCAOne("Dnyane", 1,
                50, 60, 70,
                48, 49, 45);
        double total = bcaOneStudent.getTotalMarks(600);
        assertEquals(54, (int) Math.round(total));
    }
}
