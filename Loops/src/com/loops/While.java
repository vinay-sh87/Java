package com.loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        int a = 0;
        while(a<=10){
            System.out.println("Hi " + a);
            a++;
        }
        // factorial
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        long  fact = 1;
        int i = 1;
        while(i<=n){
            fact *= i;
            i++;
        }
        System.out.println("Factorial = " + fact);

        int row = 1;
        while(row<=5){
            int col = 1;
            while(col<=row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
