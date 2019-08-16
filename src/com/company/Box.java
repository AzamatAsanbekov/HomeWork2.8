package com.company;

public class Box<A extends Number, L extends Number> {

    private A number1;
    private L number2;

    public A getNumber1() {
        return number1;
    }

    public L getNumber2() {
        return number2;
    }

    public Box(A number1, L number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}