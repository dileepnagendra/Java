package com.dileep;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int l = binarysearch(arr,target);
        System.out.println("Target found at index " +l);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean IsAsc = arr[start]<arr[end];
        while(start<end){
            int mid = start + (end-start/2);
            if(arr[mid]==target){
                return mid;
            }
            if(IsAsc){
                if(target < arr[mid]) end = mid-1;
                else start = mid+1;
            }
            else{
                if(target > arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }
}
