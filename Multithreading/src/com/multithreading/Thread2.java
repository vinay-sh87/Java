package com.multithreading;

public class Thread2 implements Runnable{
    // 2. creating object of the runnable interface
    @Override
    public void run(){
        for(int i=0;i<5;i++){
      System.out.println(Thread.currentThread()+ " "+i);
        }
    }
}
