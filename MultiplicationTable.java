package com.dileep;


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();
        System.out.print("Multiplies  : ");
        int i = in.nextInt();
        multiplication(n,i);
    }

    static void multiplication(int n,int i){
        for( int x = 1;x <= i ;x++) {
            System.out.println(n + " * " + x + " = " + (n*x) );
        }
    }
}
