package com.arrays.problems;

import java.util.Scanner;

public class DiagonalSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][3];
    try {
      System.out.println("Enter elements of the matrix: ");
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          System.out.println("Enter value of arr[" + (i + 1) + "][" + (j + 1) + "]");
          arr[i][j] = in.nextInt();
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    // left diagonal sum
    int leftDiagonalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i == j) {
          leftDiagonalSum += arr[i][j];
        }
      }
    }
    // left diagonal sum
    int rightDiagonalSum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i == j) {
          rightDiagonalSum += arr[i][j];
        }
      }
    }
    System.out.println("Left diagonal sum = " + leftDiagonalSum);
    System.out.println("Right diagonal sum = " + rightDiagonalSum);
  }
}
