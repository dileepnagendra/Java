package com.dileep;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        MaxAndMin(a,b,c);
    }

    private static void MaxAndMin(int a, int b, int c) {
        int max = ((a>b)?a:b)>c?((a>b)?a:b):c;
        int min = ((a<b)?a:b)<c?((a<b)?a:b):c;
        System.out.println("Max = " +max+ " and Min = " + min);
    }

}
