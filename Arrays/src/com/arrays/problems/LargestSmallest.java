package com.arrays.problems;

import java.util.Scanner;

public class LargestSmallest {
  // print the elements
  static void print_array(int[] arr) {
    for (int e : arr) {
      System.out.print(e + " ");
    }
    System.out.println();
  }

  // largest
  static int largest(int[] arr) {
    int max = arr[0];
    for (int e : arr) {
      if (e > max) {
        max = e;
      }
    }
    return max;
  }

  // smallest
  static int smallest(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int e : arr) {
      if (e < min) {
        min = e;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[10];
    try {
      System.out.println("Enter 10 elements : ");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    print_array(arr);
    System.out.println("Largest element : " + largest(arr));
    System.out.println("Smallest element : " + smallest(arr));
  }
}
