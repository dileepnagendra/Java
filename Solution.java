package com.dileep;

import java.util.Scanner;

class Solution {
    public static void subtractProductAndSum(int n) {
        int rem ,sum = 0;
        int product = 1;
        while(n!=0){
            rem = n%10;
            product = product*rem;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println((product-sum));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        subtractProductAndSum(n);
    }
}
