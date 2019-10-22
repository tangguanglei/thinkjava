package com.tangguanglei.chapter2.exercise;

/**
 * print args
 */
public class PrintSystemIn {

    public static void main(String[] args) {
        if (args != null) {
            for (String s : args) {
                System.out.println(s);
            }
        }
    }
}
