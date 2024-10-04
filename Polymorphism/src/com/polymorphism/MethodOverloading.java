package com.polymorphism;

public class MethodOverloading {
  public static int add(int a, int b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  public static float add(float a, float b) {
    return a + b;
  }

  public static double area(double radius) {
    return 3.14 * radius * radius;
  }

  public static double area(double len, double wid) {
    return len * wid;
  }

  public static void main(String[] args) {
    System.out.println(add(12, 345));
    System.out.println(add(12, 345, 56));
    System.out.println(add(12.55f, 345.45f));
    System.out.println(area(4));
    System.out.println(area(9, 2));
  }
}
