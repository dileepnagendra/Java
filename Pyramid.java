package com.dileep;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter Height  of Pyramid : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
