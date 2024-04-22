package com.dileep;

public class Restuarant {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Order taken");
                preparefood();
            }

            public synchronized void preparefood() {
                System.out.println("Food Preperation : Strted by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Food Preperation : Done");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
        Thread t3 = new Thread(r);
        t3.start();
    }
}

