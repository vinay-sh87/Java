package com.method;

import java.util.Scanner;

public class Method {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
        System.out.println("Sum = "+sum(34,67));

    }
}
