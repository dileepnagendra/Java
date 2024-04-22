package com.dileep;



import javax.swing.*;

public class Ceiling {
    public static void main(String[] args) {
        int[] letters = {2,4,6,7,8,11,17,19,23,56};
        int target = 1;
        SearchElement(letters,target);

    }

    static void SearchElement(int[] letters, int target) {
        int start = 0;
        int end = letters.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == letters[mid]) {
                System.out.println(letters[mid]);
                break;
            }
            else if(target > letters[mid]){
               if(target < letters[mid+1]) {
                   System.out.println(letters[mid+1]);
                   break;
               }
               start = mid + 1;
           }
           else if(target < letters[mid]){
               if(target > letters[mid-1]){
                   System.out.println(letters[mid]);
                   break;
               }
               end = mid -1;
           }

        }
    }
}
