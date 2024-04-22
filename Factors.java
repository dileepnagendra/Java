package com.dileep;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();
        for(int i = 1;i <= n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
    }
}
