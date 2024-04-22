package com.dileep;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = in.nextInt();
        CheckPalindrome(n);
    }

    public static void CheckPalindrome(int n) {
        int rem, rev = 0;
        int org = n;
        while (n!=0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(org == rev ? "Given number is Palindrome" : "Given number is not Palindrome");
    }
}
