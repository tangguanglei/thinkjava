package com.tangguanglei.oop;

public class Squire extends Shape{

    public Squire(String name) {
        super(name);
    }

    @Override
    String draw() {
        return "Squire";
    }
}
