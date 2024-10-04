package com.abstraction;

// Interface fields are public, static and final by default, and the methods are public and abstract
interface Bank {
  double rateOfInterest();
}

class SBI implements Bank {
  public double rateOfInterest() {
    return 9.98;
  }
}

class PNB implements Bank {
  public double rateOfInterest() {
    return 7.12;
  }
}

interface A {
  void print();
}

interface B extends A {
  void show();
}

class C implements A, B {
  public void print() {
    System.out.println("Hello...");
  }

  public void show() {
    System.out.println("Welcome!");
  }
}

public class Interface {
  public static void main(String[] args) {
    Bank sbi = new SBI();
    Bank pnb = new PNB();
    System.out.println("SBI rate of interest : " + sbi.rateOfInterest());
    System.out.println("PNB rate of interest : " + pnb.rateOfInterest());

    C c = new C();
    c.print();
    c.show();
  }
}
