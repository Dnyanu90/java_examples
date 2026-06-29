package com.tecspeak.inheritance;

public abstract class  Employee {
    protected String name;
    protected  double baserate;

    public  Employee(String name, double baserate){
        this.name=name;
        this.baserate=baserate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaserate(double baserate) {
        this.baserate = baserate;
    }

    public abstract double calculatepay();
}
