package com.dileep;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello , " + greet(name));

    }
    static String greet(String name) {
        return name;
    }
}
