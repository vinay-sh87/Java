package com.polymorphism;

/* final keyword can be used in three context
1. variable
2. method
3. class
constructor can't be declared as final because it is never inherited...*/

class Bike {

  final int speedLimit = 160;
  final String plateNumber; // final blank variable

  {
    plateNumber = "MGHLTHK8989";
  }

  final void run(final int price) { // final parameter
    // price = price +3002; // error
    System.out.println("Bike running at the max speed of : " + speedLimit);
  }
}

class Honda extends Bike {
  // error
  //  void run(){
  //    System.out.println("Bike running at the max speed of : "+super.speedLimit);
  //  }
}

final class A {}

/*
class B extends A {
  // error
  void Fun(){
    System.out.println("Final class can't be inherited...");
  }
}
*/

public class FinalKeyword {
  public static void main(String[] args) {
    Honda h = new Honda();
    h.run(450000);
  }
}
