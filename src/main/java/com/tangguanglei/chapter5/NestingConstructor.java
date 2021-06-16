package com.tangguanglei.chapter5;

public class NestingConstructor {

    private int i;

    private String s;

    public NestingConstructor(int i) {
        this.i = i;
    }

    public NestingConstructor(String s) {
        this.s = s;
    }

    public NestingConstructor() {
        this(1);
    }
}
