package com.tangguanglei.oop;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract String draw();

    String getName() {
        return name;
    }
}
