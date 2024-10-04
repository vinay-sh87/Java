package com.intro;

public class Operators {
    public static void main(String[] args){
        // 1. Arithmetic Operators
        int n1 = 15;
        int n2 = 19;
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n2/n1); // quotient
        System.out.println(n2%n1); // remainder
        // 2. Assignment Operators
        n1 += 2;
        System.out.println(n1);
        n1 -= 2;
        System.out.println(n1);
        n1 *= 2;
        System.out.println(n1);
        n1 /= 2;
        System.out.println(n1);
        n1 %= 2;
        System.out.println(n1);
        n1 <<= 2;
        System.out.println(n1);
        // 3. Comparison Operators
        int a = 32;
        int b = 39;
        System.out.println(a>b);
        System.out.println(b>=a);
        System.out.println(a==b);
        System.out.println(a!=b);
        // 4. Logical Operators
        System.out.println((a<b) && (a>10)); // logical and
        System.out.println((a>b) || (a>10)); // logical or
        System.out.println(!(a==b)); // logical not
        // 5. Bitwise Operators
        int val1 = 5;
        int val2 = 7;
        val1 = val1 >> 2; // right shift
        System.out.println(val1);
        val1 = val1 << 2; // left shift
        System.out.println(val1);
        System.out.println(val1 & val2); // bitwise and
        System.out.println(val1 | val2); // bitwise or
        System.out.println(val1 ^ val2); // bitwise xor
        // increment & decrement
        val1++; // post
        System.out.println(val1);
        ++val1; // pre
        System.out.println(val1);
        val2--;
        System.out.println(val2);
        --val2;
        System.out.println(val2);
    }
}
