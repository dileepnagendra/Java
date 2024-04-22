package com.dileep;

public class ClassDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        int x = d1.area();
        System.out.println(x);
    }
}
class Demo{
    int l= 10;int b=20;
    int area(){
        return l*b;
    }
}
