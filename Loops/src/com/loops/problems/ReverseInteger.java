package com.loops.problems;

import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    // WAP to reverse a integer
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int ans = 0;
    while (num != 0) {
      int digit = num % 10;
      ans = (ans * 10) + digit;
      num = num / 10;
    }
    System.out.println("Reversed Number : " + ans);
  }
}
