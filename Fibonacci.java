package com.dileep;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fibonacci up to numbers : ");
        int n = in.nextInt();
        CalcFibo(n);

    }

    static void CalcFibo(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a + " " + b);
        while(n > 2){
            temp = b;
            b = a + b;
            a = temp;
            System.out.print(" " + b);
            n--;
        }
    }
}
