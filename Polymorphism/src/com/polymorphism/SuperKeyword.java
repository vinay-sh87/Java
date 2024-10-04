package com.polymorphism;

class Animal {
  String color = "white";

  Animal() {
    System.out.println("Animal is created...");
  }

  public void eat() {
    System.out.println("Animal is eating...");
  }
}

class Dog extends Animal {
  String color = "black";

  Dog() {
    super(); // to access parent class constructor
    System.out.println(
        "Color of Animal : " + super.color); // to access parent class instance variable
    System.out.println("Color of Dog : " + color);
    super.eat(); // to access parent class methods
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Dog d = new Dog();
  }
}
