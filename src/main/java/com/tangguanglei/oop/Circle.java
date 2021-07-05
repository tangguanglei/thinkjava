package com.tangguanglei.oop;

public class Circle extends Shape{
    public Circle(String name) {
        super(name);
    }

    @Override
    String draw() {
        return "Circle";
    }
}
