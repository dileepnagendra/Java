package com.dileep;

import java.util.Scanner;

public class SumAndMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = in.nextInt();
        int sum=0,max =0;
        while(n!=0){
            sum = sum + n;
            if(n>max) max = n;
            n = in.nextInt();
        }
        System.out.println("Sum is "+ sum);
        System.out.println("Max is "+max);
    }
}
