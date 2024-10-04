package com.inheritance;

class Vehicle {
  String model;

  Vehicle() {}

  Vehicle(String model) {
    this.model = model;
  }

  void move() {
    System.out.println(model + " is moving...");
  }
}

class Car extends Vehicle {
  int numOfDoors;

  Car() {}

  Car(String model, int numOfDoors) {
    super(model);
    this.numOfDoors = numOfDoors;
  }

  void openDoor() {
    System.out.println(model + "Car with " + numOfDoors + " is opening...");
  }
}

class SuperCar extends Car {
  int maxSpeed;

  SuperCar() {}

  SuperCar(String model, int numOfDoors, int maxSpeed) {
    super(model, numOfDoors);
    this.maxSpeed = maxSpeed;
  }

  void accelerate() {
    System.out.println(model + " is accelerating at Max Speed " + maxSpeed);
  }
}

public class Multilevel {
  public static void main(String[] args) {
    SuperCar car = new SuperCar("Bugatti", 2, 400);
    car.move();
    car.openDoor();
    car.accelerate();
  }
}
