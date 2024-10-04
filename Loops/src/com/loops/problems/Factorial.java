package com.loops.problems;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    // WAP to print factorial of number given by user.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int ans = 1;
    int i = 1;
    while (i <= num) {
      ans = ans * i;
      i++;
    }
    System.out.println("Factorial of " + num + " is " + ans);
  }
}
