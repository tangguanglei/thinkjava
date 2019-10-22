package com.tangguanglei.chapter2.exercise;

/**
 * invoke static method
 */
public class Incrementable {

    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        //1
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        //2
        Incrementable.increment();
    }
}
