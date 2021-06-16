package com.tangguanglei.chapter5;

public class Book {

    boolean checkedOut = false;

    public Book(boolean checkOut) {
        this.checkedOut = checkOut;
    }

    public void checkIn() {
        this.checkedOut = false;
    }

    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
        super.finalize();
    }
}
