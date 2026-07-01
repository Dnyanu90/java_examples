package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Developer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDevloper {
    @Test
    public void testDevloperDetails(){
        Developer devloper=new Developer(3,"Dnyane",23000,"Java");
        String result=devloper.getdetils();

        assertEquals("3 Dnyane 23000.0 Java",result);


    }
}
