package com.dileep;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year : ");
        int n = in.nextInt();
        if (IsLeap(n)) {
            System.out.println(n + " Is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }
    }

    static boolean IsLeap(int n){
        boolean leap = false;
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == -0) {
                    leap = true;
                }
            } else {
                leap = true;
            }
        }
        return leap;
    }
}


