package com.loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args){
        for(int a = 5; a <= 10;a++){
            System.out.println("Hello "+ a);
        }
        // sum of n numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of " + n + " numbers = " + sum);

    }
}
