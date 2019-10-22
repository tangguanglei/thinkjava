package com.tangguanglei.chapter2.exercise;

/**
 * Get the byte size occupied by the string.
 */
public class StringStorage {

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        StringStorage stringStorage = new StringStorage();
        System.out.println(stringStorage.storage("hello, world"));
    }
}
