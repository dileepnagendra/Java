package com.dileep;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Primes {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the range : ");
        int a = in.nextInt();
        int b = in.nextInt();
        PrimesOverRange(a,b);
    }

    private static void PrimesOverRange(int a, int b) {
        int flag;
        for (int i = a; i <= b ; i++) {
            flag = 0;
            for (int j = 2; j <= sqrt(i) ; j++) {
                if(i%j==0){
                    flag = 1;
                }
            }
            if(flag == 0 ) {
                System.out.print( i + " ");
            }
        }
    }
}
