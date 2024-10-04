package com.polymorphism;

class Parent {
  int salary;

  Parent() {
    System.out.println("Salary : " + salary);
  }

  {
    salary = 800000;
  } // instance initializer block

  {System.out.println("instance initializer block");}
}

public class InstanceInitializerBlock {
  public static void main(String[] args) {
    Parent p = new Parent();
  }
}
