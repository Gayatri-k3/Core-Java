package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Book;

public class Novel implements Book {
    public void read() {
        System.out.println("Reading a novel");
    }
}