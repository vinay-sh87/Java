package com.multithreading;

public class ThreadTester {
  public static void main(String[] args) { // main thread(user thread)
    System.out.println("Main is starting...");
    Thread thread1 = new Thread1("thread1");
    // thread1.setDaemon(true); // if the user thread executed then the daemon thread won't be executed
    thread1.start(); // jvm calls the run method

    Thread thread2 = new Thread(new Thread2(),"thread2");
    thread2.start();
    System.out.println("Main is exiting...");
    new Thread().run();
  }
}
