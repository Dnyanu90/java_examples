package com.tecspeak.basic;

import com.tecspeak.basics.SumOfDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitTest {
    @Test
    public void getSumOfDigit(){
        assertEquals(7, SumOfDigit.sum0fDigit(124));
    }
}
