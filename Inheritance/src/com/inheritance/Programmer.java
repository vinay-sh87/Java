package com.inheritance;

class Employee {
  String name;
  float salary = 400000;

  Employee() {
    System.out.println("Employee Constructor called");
  }
}

class Programmer extends Employee {
  int bonus = 10000;

  Programmer() {
    System.out.println("Programmer Constructor called");
  }

  public static void main(String[] args) {
    Programmer p = new Programmer();
    float salary = p.salary + p.bonus;
    System.out.println("Salary = " + salary);
  }
}
