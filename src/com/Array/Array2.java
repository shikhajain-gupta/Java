package com.Array;

public class Array2 {
    public static void main(String[] args) {
        //int[][] arr1 = new int[3][3];
        int[][] arr1 = new int[][]{{11, 12, 13}, {21, 22, 23}};

        for(int[] i : arr1)
        {
            for(int j: i) {
                System.out.println(" " + j);
            }
            System.out.println();
        }
    }
}
