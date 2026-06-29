package com.tecspeak.inheritance;

public class FullTimeEmployee  extends Employee {
    private  double bonus;
    private double taxDeductionPercentage;

    public FullTimeEmployee(String name ,double baserate,double bonus,double taxDeductionPercentage){
        super(name,baserate);
        this.bonus=bonus;
        this.taxDeductionPercentage=taxDeductionPercentage;


    }

    @Override
    public double calculatepay() {
        double grosspay=baserate+bonus;
        double taxamount=grosspay*(taxDeductionPercentage);
        return  grosspay-taxamount;

//        return 0;
    }
}
