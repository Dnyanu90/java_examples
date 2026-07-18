package com.tecspeak.math;

public class Halfer {
    private int num;

    public Halfer(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getHalf() {
        return this.num * this.num;
    }
}

