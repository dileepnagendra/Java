package com.dileep;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = in.nextInt();
        long factorial = Fact(n);
        System.out.println("Factorial of given  number is  "+factorial);
    }

    private static long Fact(long n) {
        if(n == 0){
            return 1;
        }
        else {
            return n * Fact(n - 1);
        }
    }
}
