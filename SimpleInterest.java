package com.dileep;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of Interest : ");
        float r = sc.nextFloat();
        System.out.print("Enter Time in years : ");
        int t = sc.nextInt();
        System.out.println("Interest = " + simpint(p,r,t));
    }

    static float simpint(int p, float r, int t) {
        return (p*t*r/100);
    }
}
