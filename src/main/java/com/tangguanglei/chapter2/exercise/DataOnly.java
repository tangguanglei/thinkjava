package com.tangguanglei.chapter2.exercise;

import lombok.Data;

/**
 * print class fields value of assignment
 */
@Data
public class DataOnly {

    private int i = 1;

    double d = 1d;

    boolean b = true;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.println(dataOnly.getI());
        System.out.println(dataOnly.getD());
        System.out.println(dataOnly.isB());
    }
}
