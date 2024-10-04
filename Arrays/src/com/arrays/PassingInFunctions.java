package com.arrays;

public class PassingInFunctions {
  public static void main(String[] args) {
    int[] num = {3, 4, 54, 6, 7};
    System.out.println(num[1]);
    printArray(num);
  }

  static void printArray(int[] arr) { // arr is pointing to the same object
    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }
}
