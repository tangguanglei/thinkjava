package com.tangguanglei.chapter1;

public class Square extends Shape{
    @Override
    public String draw() {
        return "Square";
    }

    @Override
    public String erase() {
        return "The Square has erased";
    }

    @Override
    public String move() {
        return "The Square has moved";
    }

    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public String setColor() {
        return "white";
    }
}
