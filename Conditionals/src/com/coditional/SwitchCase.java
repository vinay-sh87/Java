package com.coditional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter day...");
        int d = inp.nextInt();
        String day;
        switch(d){
            case 1:
                day = "Monday";
                break;
              case 2:
                day = "Tuesday";
                break;
              case 3:
                day = "Wednesday";
                break;
              case 4:
                day = "Thursday";
                break;
              case 5:
                day = "Friday";
                break;
              case 6:
                day = "Saturday";
                break;
              case 7:
                day = "Sunday";
                break;
            default:
                day = "Wrong input";
        }
        System.out.println(day);

    }
}
