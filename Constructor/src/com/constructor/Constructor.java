package com.constructor;

class Car {
  String name;
  int price;

  public Car() {} // Default Constructor

  public Car(String name, int price) { // Parameterized Constructor
    this.name = name;
    this.price = price;
  }

  public void getInfo() {
    System.out.println("Name: " + name);
    System.out.println("Price: " + price);
  }
}

public class Constructor {
  public static void main(String[] args) {
    Car c3 = new Car();
    c3.getInfo();

    Car c1 = new Car("BMW X1", 4000000);
    Car c2 = new Car("Audi Q7", 10000000);
    c1.getInfo();
    c2.getInfo();
  }
}
