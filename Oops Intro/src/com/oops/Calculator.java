package com.oops;

import java.util.Scanner;

class Calc {
  private int x, y;

  // Constructor
  public Calc(int a, int b) {
    x = a;
    y = b;
  }

  public int add() {
    return x + y;
  }

  public int subtract() {
    return x - y;
  }

  public int multi() {
    return x * y;
  }

  public int division() {
    return x / y;
  }

  public int remain() {
    return x + y;
  }
}

public class Calculator {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int firstNumber = 0, secondNumber = 0;
    char op = 0;
    try {
      System.out.println("Enter two numbers : ");
      firstNumber = inp.nextInt();
      secondNumber = inp.nextInt();
      System.out.println("Enter the operation you wanna perform : +,-,*,/,% ");
      op = inp.next().charAt(0);
    } catch (Exception e) {
      System.out.println(e);
    }

    Calc c = new Calc(firstNumber, secondNumber);
    switch (op) {
      case '+':
        int sum = c.add();
        System.out.println(sum);
        break;
      case '-':
        int sub = c.subtract();
        System.out.println(sub);
        break;
      case '*':
        int multi = c.multi();
        System.out.println(multi);
        break;
      case '/':
        int div = c.division();
        System.out.println(div);
        break;
      case '%':
        int rem = c.remain();
        System.out.println(rem);
        break;
    }
  }
}
