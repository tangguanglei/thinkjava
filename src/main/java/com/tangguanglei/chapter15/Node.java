package com.tangguanglei.chapter15;

import java.util.List;
public class Node<T extends Fruit> {

    private T t;

    public void print() {
        System.out.println(t.toString());
    }

    public void f(List<? extends T> list) {

    }
}
