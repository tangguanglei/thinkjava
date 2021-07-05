package com.tangguanglei.oop;

public class Square extends Shape{

    public Square(String name) {
        super(name);
    }

    @Override
    String draw() {
        return "Squire";
    }
}
