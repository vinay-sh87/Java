package com.abstraction;

/* Hiding the implementation details --> we can achieve it in two ways
1. Abstract class (0 to 100%)
2. Interface (100%)
 */

import java.awt.*;

abstract class Animal {
  // abstract class and method doesn't need implementation
  abstract void makeSound();

  public void sleep() {
    System.out.println("The animal is sleeping");
  }
}

class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Woof!");
  }
}

class Cat extends Animal {
  @Override
  void makeSound() {
    System.out.println("Meow!");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.makeSound();
    cat.makeSound();
  }
}
