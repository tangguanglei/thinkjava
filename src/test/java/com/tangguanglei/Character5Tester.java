package com.tangguanglei;

import com.tangguanglei.chapter5.Book;
import org.junit.Test;

public class Character5Tester {

    @Test
    public void finalizeTest() {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
