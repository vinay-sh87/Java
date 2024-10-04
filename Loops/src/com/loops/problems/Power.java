package com.loops.problems;

import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    // WAP to print power of any base given by user.
    Scanner in = new Scanner(System.in);
    int base, power;
    System.out.println("Enter Base : ");
    base = in.nextInt();
    System.out.println("Enter Power : ");
    power = in.nextInt();
    int result = 1;
    int i = 1;
    while (i <= power) {
      result = result * base;
      i++;
    }
    System.out.println("Ans: " + result);
  }
}
