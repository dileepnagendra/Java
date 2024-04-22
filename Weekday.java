package com.dileep;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Tue");
            default -> System.out.println("Enter valid");
        }

    }
}
