package com.dileep;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(sumof(n1,n2));
    }

    static int sumof(int a,int b){
        return a + b;
    }
}
