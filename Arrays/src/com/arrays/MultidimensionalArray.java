package com.arrays;

import java.util.Arrays;

public class MultidimensionalArray {
  public static void main(String[] args) {
    int[][] arr = new int[3][];
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Last item: "  + mat[2][2]);
    System.out.println(Arrays.toString(mat[0]));
    System.out.println(Arrays.toString(mat[1]));
    System.out.println(Arrays.toString(mat[2]));
  }
}
