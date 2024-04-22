package com.dileep;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        PythagoreanCheck(a,b,c);
    }

    private static void PythagoreanCheck(int a, int b, int c) {
        if(a*a + b*b == c*c) System.out.println("The Triplet is ("+a+","+b+","+c+")");
        else if (b*b + c*c == a*a) System.out.println("The Triplet is ("+b+","+c+","+a+")");
        else if(c*c + a*a == b*b) System.out.println("The Triplet is ("+c+","+a+","+b+")");
        else System.out.println("No Triplet Found");
    }
}
