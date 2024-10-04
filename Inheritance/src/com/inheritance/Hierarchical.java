package com.inheritance;

class Animals {
  void makeSound() {
    System.out.println("Animal Sound");
  }
}

class Dogs extends Animals {
  @Override
  void makeSound() {
    System.out.println("Dog Barks");
  }
}

class Cats extends Animals {
  @Override
  void makeSound() {
    System.out.println("Cats Meows");
  }
}

public class Hierarchical {
  public static void main(String[] args) {
    Dogs d = new Dogs();
    d.makeSound();
    Cats c = new Cats();
    c.makeSound();
  }
}
