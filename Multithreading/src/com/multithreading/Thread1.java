package com.multithreading;

public class Thread1 extends Thread {
  // creating thread
  // 1. extending thread class
  public Thread1(String threadName){
    super(threadName);
  }
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("inside "+Thread.currentThread().getName()+" "+i);
    }
  }
}
