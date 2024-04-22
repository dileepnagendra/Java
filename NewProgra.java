package com.dileep;

import java.util.Scanner;

public class NewProgra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt();
        int e = sc.nextInt();
        int count;
        if((e-b)<num){
            count = e-b+1;
        } else count = num;
        System.out.println(count);
    }
}
