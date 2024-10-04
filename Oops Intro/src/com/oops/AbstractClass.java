package com.oops;

// abstract class
abstract class Abstract{
    // abstract method
    abstract void display();
}
public class AbstractClass extends Abstract {

    void display() {
    System.out.println("From Abstract Function");
    }

    public static void main(String[] args){
        AbstractClass abs = new AbstractClass();
        abs.display();
    }
}
