package com.dileep;

import java.util.ArrayList;

public class Rules {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("phone");
        a1.add("blue");
        a1.add("pixel");
        items.add(a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("computer");
        a2.add("silver");
        a2.add("lenovo");
        items.add(a2);

        ArrayList<String> a3 = new ArrayList<String>();
        a3.add("phone");
        a3.add("gold");
        a3.add("iphone");
        items.add(a3);
        int n = countMatches(items,"type","phone");
        System.out.println(n);
    }

        public static  int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
            int count = 0;
            for(ArrayList<String> item : items){
                if(ruleKey.equals("type") && item.get(0).equals(ruleValue)){
                    count++;
                }
                else if(ruleKey.equals("color") && item.get(1).equals(ruleValue)){
                    count++;
                }
                else if(ruleKey.equals("name") && item.get(2).equals(ruleValue)){
                    count++;
                }
            }
            return count;
        }

}
