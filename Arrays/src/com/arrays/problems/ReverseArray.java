package com.arrays.problems;

import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    // Reverse an array by taking input from user
    Scanner in = new Scanner(System.in);
    int size = 5;
    int[] nums = new int[size];
    try {
      System.out.println("Enter 5 elements : ");
      for (int i = 0; i < 5; i++) {
        nums[i] = in.nextInt();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    for (int i = 0; i < nums.length / 2; i++) {
      int temp = nums[i];
      nums[i] = nums[size - i - 1];
      nums[size - i - 1] = temp;
    }
    for (int e : nums) {
      System.out.print(e + " ");
    }
    System.out.println();
  }
}
