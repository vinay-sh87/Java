package com.encapsulation;

/* **Encapsulation in Java is a process of wrapping code and data together into a single unit.
We can create a fully encapsulated class in Java by making all the data members of the class private.
 */
class Students {
  private String name;
  private int age;
  private char subject;

  public void setInfo(String name, int age, char subject) {
    this.name = name;
    this.age = age;
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public int age() {
    return age;
  }

  public char subject() {
    return subject;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Students st = new Students();
    st.setInfo("Aman", 19, 'D');
    System.out.println("Name : " + st.getName());
    System.out.println("Age : " + st.age());
    System.out.println("Subject : " + st.subject());
  }
}
