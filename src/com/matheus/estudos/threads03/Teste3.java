package com.matheus.estudos.threads03;

public class Teste3 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread 1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread 2", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread 3", 800);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        t2.start();

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Programa finalizado!");

    }
}
