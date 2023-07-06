package com.example;

import com.github.cchiriac518.librarytest.MyLibrary;


public class MyApp {
    public static void main(String[] args) {
        MyLibrary.sayHello();

        int result = MyLibrary.add(3, 4);
        System.out.println("Result: " + result);
    }
}
