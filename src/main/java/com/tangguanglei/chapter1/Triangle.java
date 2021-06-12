package com.tangguanglei.chapter1;

public class Triangle extends Shape{
    @Override
    public String draw() {
        return "Triangle";
    }

    @Override
    public String erase() {
        return "The Triangle has erased";
    }

    @Override
    public String move() {
        return "The Triangle has moved";
    }

    @Override
    public String getColor() {
        return "yellow";
    }

    @Override
    public String setColor() {
        return "yellow";
    }
}
