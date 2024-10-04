package com.arrays.problems;

import java.util.Scanner;

public class Sum {
  // Sum of 10 numbers after taking input from user
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    try {
      System.out.println("Enter 10 numbers : ");
      for (int i = 0; i < 10; i++) {
        arr[i] = sc.nextInt();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    int sum = 0;
    for (int a : arr) {
      sum += a;
    }
    System.out.println("Sum = " + sum);
  }
}
