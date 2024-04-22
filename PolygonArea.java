package com.dileep;
import java.util.*;
public class PolygonArea{
    public static void main(String[] args) {
        System.out.println("Area of Rectangle : "+area(10,20));
        System.out.println("Area of Square : "+area(10));
    }
    static int area(int l,int b){
        return l*b;
    }

    static int area(int s){
        return s*s;
    }
}

