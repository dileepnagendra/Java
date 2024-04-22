package com.dileep;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = in.nextInt();
        GradeCheck(marks);
    }

    private static void GradeCheck(int marks) {
        if(marks >= 91 && marks <=100) System.out.println("Grade AA");
        if(marks >= 81 & marks <=90) System.out.println("Grade AB");
        if(marks >= 71 & marks <=80) System.out.println("Grade BB");
        if(marks >= 61 & marks <=70) System.out.println("Grade BC");
        if(marks >= 51 & marks <=60) System.out.println("Grade CD");
        if(marks >= 41 & marks <=50) System.out.println("Grade DD");
        if(marks <=40) System.out.println("Fail");
    }

}
