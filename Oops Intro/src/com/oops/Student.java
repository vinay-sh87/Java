package com.oops;

public class Student {
    public static void main(String[] args){
        Stud s1 = new Stud();
        s1.id = 1;
        s1.name = "Ashok";
        System.out.println(s1.id + " " + s1.name);
        System.out.println(Stud.findEven(34));
        // Anonymous Object
        new Stud().getInfo(2,"Anonymous");



    }
}