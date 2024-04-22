package com.dileep;

import java.util.Arrays;

public class ReverseImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);

    }
    public static void flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] flippedImage = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n; j++){
                int k = n-1;
                flippedImage[i][j] = image[i][k];
                k--;
            }
        }
        System.out.println(Arrays.toString(flippedImage));
    }
}

