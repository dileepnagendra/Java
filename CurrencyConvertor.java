package com.dileep;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in Indian rupees : ");
        int r = in.nextInt();
        float d = (float) (r/89.6);
        System.out.println("amount in dollars is " + d);
    }
}
