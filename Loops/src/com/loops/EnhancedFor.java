package com.loops;

public class EnhancedFor {
  public static void main(String[] args) {
    String[] fruits = new String[5];
    fruits = new String[] {"apple", "banana", "grapes", "watermelon", "mango"};
    for (String e : fruits) {
      System.out.println(e);
    }

    int[] nums = new int[5];
    nums = new int[] {3, 4, 45, 5, 6};
    for (int n : nums) {
      System.out.println(n);
    }
  }
}
