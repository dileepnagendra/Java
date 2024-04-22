package com.dileep;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + " Is " +  EvenOdd(n));
    }
    static String EvenOdd(int n){
        if(n%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

}
