package com.tecspeak.inheritance.organization;

import com.tecspeak.inheritance.organizations.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManager {
    @Test
    public void TestManagerDetails(){
        Manager manager=new Manager(2,6,"Dnyane", 4000.0);
        manager.setDaysWorked(10);
        String result=manager.getDetails();
        assertEquals("6 Dnyane Team Size:2 4000.0", result);

    }


}
