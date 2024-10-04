package com.string;

// String is an object that represents a sequence of characters.

import java.util.StringJoiner;

public class Strings {
  public static void main(String[] args) {
    String lovedOne = "Kusum";
    System.out.println(lovedOne);

    char[] ch = {'V', 'i', 'n', 'a', 'y'}; // char array
    String myName = new String(ch); // converting into string object
    System.out.println(ch);
    System.out.println(myName);

    String s1 = "Get the work done!";
    String s2 =
        "Get the work done!"; // creates a new reference (s2) not a new string instance in string
                              // constant pool
    String s3 = new String("Something");

    // Strings are immutable
    String str = "Jasprit";
    str.concat("Bumrah");
    System.out.println(str); // not changed
    str = str.concat(" Bumrah");
    System.out.println(str); // still Jasprit object is not modified

    // String comparison
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    String st1 = "abc";
    String st2 = "ABC";
    System.out.println(st1.equals(st2));
    System.out.println(st1.equalsIgnoreCase(st2));
    String st3 = "abc";
    String st4 = new String("abc"); // created in non pool
    System.out.println(st1 == st3); // both refers to same instance
    System.out.println(st1 == st4); // false
    System.out.println(st1.compareTo(st3)); // 0 for equal
    System.out.println(st1.compareTo(st2)); // +ve for (st1 > st2)
    System.out.println(st2.compareTo(st1)); // -ve for (st1 < st2)

    // Concatenation
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    System.out.println(firstName.concat(lastName));

    String s = String.format("%s %s",firstName,lastName);
    System.out.println(s);

    s = String.join(" ",firstName,lastName);
    System.out.println(s);

    StringJoiner str1 = new StringJoiner(" ");
    str1.add("Hello");
    str1.add("Java");
    System.out.println(str1);

    StringBuilder first = new StringBuilder("Sachin");
    StringBuilder last = new StringBuilder("Tendulkar");
    StringBuilder full = first.append(" ").append(last);
    System.out.println(full);
  }
}
