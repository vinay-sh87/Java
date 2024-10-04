package com.polymorphism;

/*Connecting a method call to method body is known as binding  --> 2 types
1. Static Binding -->  type of the object is determined at compiled time
2. Dynamic Binding -->  type of the object is determined at run time
    **If there is any private, final or static method in a class, there is static binding.
*/

class Ant {
  // Static Binding
  private void eat() {
    System.out.println("Ants are eating...");
  }
}

// Dynamic Binding
class Vehicle {
  void run() {
    System.out.println("Vehicle is running...");
  }
}

class Car extends Vehicle {
  void run() {
    System.out.println("Car is running...");
  }
}

public class Binding {
  public static void main(String[] args) {
    Ant a = new Ant();
    Vehicle c =
        new Car(); /* object type cannot be determined by the compiler, because the instance of Dog is also
                   an instance of Animal.*/
    c.run();
    // instanceof operator
    System.out.println(a instanceof Ant);
    System.out.println(c instanceof Vehicle);
    System.out.println(c instanceof Car);
  }
}
