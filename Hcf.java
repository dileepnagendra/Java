package com.dileep;

import java.util.Scanner;

public class Hcf{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Hcf is " + HCF(x,y));
        System.out.println("LCM is " + LCM(x,y,HCF(x,y)));
    }

     static int LCM(int x, int y, int hcf) {
        return (x*y) / hcf;
    }

    static int HCF(int x, int y) {

        int a = x;
        int b = y;
        if ( x < y){
            a = y;
            b = x;
        }
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }



}
