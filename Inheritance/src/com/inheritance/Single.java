package com.inheritance;

class Animal {
  String name;
  int age;

  Animal() {}

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println(name + " is eating...");
  }

  public void getInfo() {
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }
}

class Dog extends Animal {
  String bread;

  Dog() {}
  ;

  Dog(String name, int age, String bread) {
    super(name, age); // Call parent constructor to initialize name and age
    this.bread = bread;
  }

  public void bark() {
    System.out.println("Dog is barking...");
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println("Bread : " + bread);
  }
}

public class Single {
  public static void main(String[] args) {
    Dog dog = new Dog("Tony", 4, "Labrador");
    dog.eat();
    dog.getInfo();
  }
}
