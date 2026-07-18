package com.tecspeak.inheritance.institute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BCATwo}.
 *
 * @author TecSpeak
 */
public class BCATwoTest {

    /**
     * Tests the getTotalMarks() method for a BCATwo student.
     */
    @Test
    public void getTotalMarks() {
        Student student = new BCATwo("Dnyane", 204,
                93, 90, 87, 78);

        double total = student.getTotalMarks();
        assertEquals(348, total);
    }
}
