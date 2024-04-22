package com.dileep;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter Operator : ");
        char op = in.next().trim().charAt(0);
        Calc(a,b,op);
    }

    static void Calc(int a, int b, char op) {
        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("Enter Valid Operator");
        }
    }
}
