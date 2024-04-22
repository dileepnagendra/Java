package com.dileep;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayslist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        for (int i = 0; i <5; i++) {
            list.add(sc.nextInt());
        }
        list.add("Shiva");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(56));
        list.set(0,99);
        System.out.println(list);
    }
}
