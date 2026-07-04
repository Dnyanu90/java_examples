package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Intern;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntern {
    @Test
    public void TestInterDetails(){
        Intern intern =new Intern(104,"Dnyane",4,600);
         String result=intern.getDetails();

         assertEquals("104 Dnyane 4600.0",result);
    }

    public void TestsInternDetails(){
        Intern inter=new Intern(23,"Ram",5000,500);
        String result=inter.getDetails();

//        assertEquals("1);
    }
}
