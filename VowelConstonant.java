package com.dileep;

import java.util.Scanner;


public class VowelConstonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter alphabet : ");
        char ch = in.next().trim().charAt(0);
        if(ch == 'a' || ch == 'A' ||ch == 'e' || ch == 'E' ||ch == 'i' || ch == 'I' ||ch == 'o' || ch == 'O' || ch == 'u' ||ch == 'U'){
            System.out.println("Vowel");
        }
        else System.out.println("Constonant");
    }
}
