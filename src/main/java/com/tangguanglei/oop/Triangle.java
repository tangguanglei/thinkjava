package com.tangguanglei.oop;

public class Triangle extends Shape{
    public Triangle(String name) {
        super(name);
    }

    @Override
    String draw() {
        return "Triangle";
    }
}
