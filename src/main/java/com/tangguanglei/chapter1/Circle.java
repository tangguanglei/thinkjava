package com.tangguanglei.chapter1;

public class Circle extends Shape{
    @Override
    public String draw() {
        return "Circle";
    }

    @Override
    public String erase() {
        return "The Circle has erased";
    }

    @Override
    public String move() {
        return "The Circle moved";
    }

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public String setColor() {
        return "black";
    }
}
