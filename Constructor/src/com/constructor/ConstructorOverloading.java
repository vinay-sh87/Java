package com.constructor;

class Student {
  int id, age;
  String name;

  // Default Constructor
  public Student() {}

  // Constructor with Two Parameters
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // Constructor with Three Parameters
  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  //  Constructor to initialize another object (like copy constructor in c++)
  public Student(Student s) {
    this.id = s.id;
    this.name = s.name;
    this.age = s.age;
  }

  public void getInfo() {
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println();
  }
}

public class ConstructorOverloading {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student(23, "Johnny");
    Student s3 = new Student(45, "Karthik", 19);
    s1.getInfo();
    s2.getInfo();
    s3.getInfo();

    Student s4 = new Student(s3);
    s4.getInfo();
  }
}
