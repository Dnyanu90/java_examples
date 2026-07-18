package com.tecspeak.basic;

import com.tecspeak.basics.ReverseNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ReverseNumber}.
 *
 * @author TecSpeak
 */
public class TestRevesreNumber {

    /**
     * Tests the reverseNumber method from ReverseNumber class.
     */
    @Test
    public void testReverseNumber() {
        // Test positive number reversal
        assertEquals(54321, ReverseNumber.reveseNumber(12345));
        
        // Test negative number reversal
        assertEquals(-789, ReverseNumber.reveseNumber(-987));
        
        // Test single digit
        assertEquals(5, ReverseNumber.reveseNumber(5));
        
        // Test zero
        assertEquals(0, ReverseNumber.reveseNumber(0));
    }
}
