package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Manager}.
 *
 * @author TecSpeak
 */
public class TestManager {

    /**
     * Tests the Manager pay calculation logic.
     */
    @Test
    public void TestManagerDetails() {
        Manager manager = new Manager("Dnyane", 4000.0, 1000.0);
        double result = manager.calculatePay();
        
        // Basic pay (4000) + Bonus (1000) = 5000
        assertEquals(5000.0, result);
    }
}
