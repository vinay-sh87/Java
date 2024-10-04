package com.oops;

public class Stud {
  int id;
  String name;
  static int count = 0;

  public void getInfo(int id, String name) { // instance method
    this.id = id;
    this.name = name;
    count++;
    System.out.println(count + " Obj Created");
  }

  public void putInfo() { // instance method
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
  }

  public static String findEven(int a) { // static method
    return a % 2 == 0 ? "Even" : "Odd";
  }
}
