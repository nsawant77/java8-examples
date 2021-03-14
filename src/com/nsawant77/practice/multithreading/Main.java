package com.nsawant77.practice.multithreading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i =0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}


public class Main  {

    public static void main(String[] args) {
        //MyRunnable run = new MyRunnable();
        Runnable run = () -> {
            for(int i =0; i<10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t1 = new Thread(run);
        t1.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }

}
