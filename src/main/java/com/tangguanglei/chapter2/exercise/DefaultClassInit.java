package com.tangguanglei.chapter2.exercise;

import lombok.Data;

/**
 * print class fields default value.
 */
@Data
public class DefaultClassInit {

    private int i;

    private char c;

    public static void main(String[] args) {
        DefaultClassInit defaultClassInit = new DefaultClassInit();
        System.out.println(defaultClassInit.getI());
        System.out.println(defaultClassInit.getC());
    }
}
