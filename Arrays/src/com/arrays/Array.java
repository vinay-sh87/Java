package com.arrays;

import java.util.Scanner;
import  java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int age; // we can only store a single value
        // Declaration
        int[] arr = new int[3]; // declaration: arr is a reference variable pointing to an array object (compile time)
        int[] abc; // initialization: abc reference variable  is getting defined in the stack memory (run time)
        abc = new int[4]; // object creation in the heap memory
        // Initialization
        arr[0] = 34;
        arr[1] = 23;
        arr[2] = 98;
        // Declaration and Initialization
        int[] nums = {34,4,65,77};
        // Access
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // Update
        arr[1] = 45;
        System.out.println("After updating the value of arr[1] is = "+ arr[1]);
        // Accessing elements using loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Input
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        try{
            System.out.println("Enter five elements");
            for(int i=0;i<array.length;i++){
                array[i] = sc.nextInt();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        // Output
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        // Printing elements using enhanced for loop
        for(int a:array){
            System.out.print(a+" "); // a represents element of the array
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
