package com.dileep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptiom {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        System.out.println(divide(x,y));
    }

    static int divide(int x, int y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("Zero");
        }
        else return x/y;
    }
}
