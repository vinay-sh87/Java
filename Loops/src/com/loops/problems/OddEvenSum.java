package com.loops.problems;

import java.util.Scanner;

public class OddEvenSum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char choice;
    int evenSum = 0;
    int oddSum = 0;
    do {
      System.out.println("Enter a number: ");
      int val = in.nextInt();
      if (val % 2 == 0) {
        evenSum += val;
      } else {
        oddSum += val;
      }
      System.out.println("do you wanna continue? y/Y ");
      choice = in.next().charAt(0);

    } while ((choice == 'y') || (choice == 'Y'));
    System.out.println("Even Sum = " + evenSum);
    System.out.println("Odd Sum = " + oddSum);
  }
}
