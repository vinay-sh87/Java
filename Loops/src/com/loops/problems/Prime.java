package com.loops.problems;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    // WAP to check if a number is prime or not.
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to check prime : ");
    int num = in.nextInt();
    boolean isPrime = false;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isPrime = true;
        break;
      }
    }
    if (isPrime) {
      System.out.println(num + " not a Prime Number");
    } else {
      System.out.println(num + " is a Prime Number ");
    }
  }
}
