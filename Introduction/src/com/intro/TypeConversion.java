package com.intro;

public class TypeConversion {
    public static void main(String[] args){
        byte b = 127;
        int a = 257;
        // ❌ b = a; // explicit
        // ✅ a = b; // implicit conversion
        int x = (int)45.33;
        System.out.println(x);
        b = (byte)a; // 257%range(256)
        System.out.println(b);
        System.out.println(257%256);

        byte bt = 34;
        byte bit = 45;
        int result = a*b; // type promotion
        System.out.println(result);

    }
}
