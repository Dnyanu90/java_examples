package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Developer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Developer}.
 *
 * @author TecSpeak
 */
public class TestDevloper {

    /**
     * Tests the Developer pay calculation logic.
     */
    @Test
    public void testDevloperDetails() {
        Developer devloper = new Developer("Dnyane", 3000.0, "Java");
        double result = devloper.calculatePay();

        // Basic pay (3000) + Fixed Bonus (5000) = 8000
        assertEquals(8000.0, result);
    }
}
