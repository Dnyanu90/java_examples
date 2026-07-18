package com.tecspeak.basic;

import com.tecspeak.basics.SumOfDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SumOfDigit}.
 *
 * @author TecSpeak
 */
public class SumOfDigitTest {

    /**
     * Tests the sumOfDigit method.
     */
    @Test
    public void getSumOfDigit(){
        assertEquals(7, SumOfDigit.sum0fDigit(124));
    }
}
