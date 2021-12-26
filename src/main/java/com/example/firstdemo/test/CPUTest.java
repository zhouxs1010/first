package com.example.firstdemo.test;

public class CPUTest {

    public static void main(String[] args) {

        Runnable cpu = new Runnable() {
            @Override
            public void run() {
                //消耗cpu
                while (true) {
                    double b = Math.random() * Math.random();
                    try {
                        Thread.sleep(1000);
                        System.out.println("123455-----");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable memory = new Runnable() {
            @Override
            public void run() {
                //消耗memory
                while (true) {
                    try {
                        byte b[] = new byte[1024 * 1024 * 50]; // 50M
                        Thread.sleep(1000);
                        System.out.println("消耗memory-----");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(cpu);
        thread1.start();
        Thread thread2 = new Thread(memory);
        thread2.start();

    }
}

