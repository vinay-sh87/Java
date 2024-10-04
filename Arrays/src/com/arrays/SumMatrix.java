package com.arrays;

import java.util.Scanner;

public class SumMatrix {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr1 = new int[3][3];
    int[][] arr2 = new int[3][3];
    try {
      // Input
      for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1.length; j++) {
          System.out.println("Enter the value of arr1[" + (i + 1) + "][" + (j + 1) + "]");
          arr1[i][j] = in.nextInt();
        }
      }
      for (int i = 0; i < arr2.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
          System.out.println("Enter the value of arr2[" + (i + 1) + "][" + (j + 1) + "]");
          arr2[i][j] = in.nextInt();
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    // Calculation
    int[][] sum = new int[3][3];
    for (int i = 0; i < sum.length; i++) {
      for (int j = 0; j < sum.length; j++) {
        sum[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    // Output
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}
