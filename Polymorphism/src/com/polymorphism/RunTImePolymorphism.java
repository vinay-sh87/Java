package com.polymorphism;

interface Shape {
  void area(); // Abstract method - subclasses must implement
}

class Rectangle implements Shape {
  private int len;
  private int wid;

  Rectangle(int len, int wid) {
    this.len = len;
    this.wid = wid;
  }

  @Override
  public void area() {
    System.out.println("Area : " + len * wid);
  }
}

class Circle implements Shape {
  private int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public void area() {
    System.out.println("Area : " + 3.14 * radius * radius);
  }
}

public class RunTImePolymorphism {
  public static void main(String[] args) {
    Shape shape1 = new Rectangle(34, 9); // Upcasting - Rectangle object in shape reference
    shape1.area();
    Shape shape2 = new Circle(5); // assigning subclass object to super class reference
    shape2.area();
  }
}
