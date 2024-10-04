package com.coditional;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // if statement
        System.out.println("Enter a number...");
        int a = sc.nextInt();
        if(a>0)
            System.out.println("Positive"); // allowed if we've only one line of code
        if(a<0)
            System.out.println("Negative");
        if(a==0)
            System.out.println("Zero");

        // if-else statement
        boolean isWaterInTheBottle = true;
        if(isWaterInTheBottle){
            System.out.println("Drink it!");
        }else{
            System.out.println("Go n get it!");
        }
        System.out.println("Enter three numbers..");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        if(firstNumber>secondNumber){
            System.out.println(firstNumber + " greatest");
        }
        else{
            System.out.println(secondNumber + " greatest");
        }

        // if-else ladder
        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println(firstNumber);
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println(secondNumber);
        }else{
            System.out.println(thirdNumber);
        }

        // ternary operator
        int n = 45;
        String str = n%2==0 ? "Even" : "Odd";
        System.out.println(str);

    }
}
