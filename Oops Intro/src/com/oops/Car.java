package com.oops;

class Cars {
  String name;
  int modelYear;
  int price;
  public static int count = 0;

  public Cars(String n, int year, int pr) {
    name = n;
    modelYear = year;
    price = pr;
  }

  public void getData() {
    System.out.println("Name : " + name);
    System.out.println("Model Year : " + modelYear);
    System.out.println("Price : " + price);
    count++;
  }
}

public class Car {
  public static void main(String[] args) {
    Cars car1 = new Cars("Lamborghini", 2393, 200);
    car1.getData();
    Cars car2 = new Cars("Bugatti", 2022, 400);
    car2.getData();
    Cars car3 = new Cars("Ferrari", 2024, 250);
    car3.getData();
    Cars car4 = new Cars("Mustang", 2023, 300);
    car4.getData();
    System.out.println(
        "Total Number of Cars = "
            + Cars.count); // static members can only be accessed with the class name
  }
}
