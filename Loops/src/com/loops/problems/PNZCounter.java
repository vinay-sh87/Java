package com.loops.problems;

import java.util.Scanner;

public class PNZCounter {
  public static void main(String[] args) {
    // Positives, Negatives and Zeros Counter
    Scanner sc = new Scanner(System.in);
    int number;
    char choice;
    int positives = 0;
    int negatives = 0;
    int zeros = 0;

    do {
      System.out.println("Enter a number : ");
      number = sc.nextInt();
      if (number > 0) {
        positives++;
      }
      if (number < 0) {
        negatives++;
      } else {
        zeros++;
      }
      System.out.println("Do you wanna continue? y/Y");
      choice = sc.next().charAt(0);
    } while ((choice == 'y') || (choice == 'Y'));
    System.out.println("You Entered : ");
    System.out.println(positives + " Positives");
    System.out.println(negatives + " Negatives");
    System.out.println(zeros + " Zeros");
  }
}
