package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BCAThree}.
 *
 * @author TecSpeak
 */
public class BCAThreeTest {

    /**
     * Tests the getTotalMarks() method for a BCAThree student.
     */
    @Test
    public void getMarkTest() {
        Student student = new BCAThree("Dnyane", 239,
                96, 91, 95);

        double total = student.getTotalMarks();
        assertEquals(282, total);
    }
}
