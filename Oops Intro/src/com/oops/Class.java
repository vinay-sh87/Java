package com.oops;

class A {
  // data member
  private String name = "Vinay Sharma";

  // member function
  public int sum(int a, int b) {
    return a + b;
  }

  public void getName() {
    System.out.println(name);
  }

  public String playMusic() {
    return "Sunn Mere Humsafar";
  }
}

public class Class {
  public static void main(String[] args) {
    int a = 34;
    int b = 39;
    int result = a + b;
    System.out.println(result);
    // creating object
    A c = new A();
    System.out.println(c.sum(34, 65)); // accessing member functions
    String music = c.playMusic();
    System.out.println(music);
  }
}
