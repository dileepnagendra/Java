package com.dileep;

import java.util.ArrayList;
import java.util.List;
public class NewProgram {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        ArrayList<Integer> arrform = new ArrayList<>();
        String str = "";
        for(int n : num) str = str + String.valueOf(num);
        for(char c : str.toCharArray()){
            arrform.add(Integer.valueOf(c));
        }

        System.out.println(arrform);
    }
}
