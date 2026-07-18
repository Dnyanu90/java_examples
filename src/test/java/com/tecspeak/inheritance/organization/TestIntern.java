package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Intern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Intern}.
 *
 * @author TecSpeak
 */
public class TestIntern {

    /**
     * Tests the Intern pay calculation logic.
     */
    @Test
    public void TestInterDetails() {
        Intern intern = new Intern("Dnyane", 600.0);
        double result = intern.calculatePay();

        // Interns receive only their basic pay
        assertEquals(600.0, result);
    }
}
