package com.loops;

public class DoWhile {
    public static void main(String[] args){
        int a = 5;
        do{
            System.out.println("Hello " + a); // will run for the first time then check the condition
            a++;
        }while(a>10);

        // simple pattern
        int row = 1;
        do{
            int col = 1;
            do{
                System.out.print("* ");
                col++;
            }while(col<=row);
            System.out.println();
            row++;
        }while(row<=5);
    }
}
