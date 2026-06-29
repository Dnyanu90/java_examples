package com.tecspeak.inheritance;

public class ContractEmployee  extends  Employee{
    private  int hourwork;

    public ContractEmployee(String name, double baserate) {
        super(name, baserate);
        this.hourwork=hourwork;
    }

    @Override
    public double calculatepay() {
        return baserate*hourwork;

//        return 0;

    }
}
