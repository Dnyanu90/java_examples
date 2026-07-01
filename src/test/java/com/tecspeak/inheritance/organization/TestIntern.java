package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Intern;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntern {
    @Test
    public void TestInterDetails(){
        Intern intern =new Intern(104,"Dnyane",4000,3);
         String result=intern.getDetails();

         assertEquals("104 Dnyane 4000 3",result);
    }
}
