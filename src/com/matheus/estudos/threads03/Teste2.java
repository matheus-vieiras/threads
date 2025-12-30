package com.matheus.estudos.threads03;

public class Teste2 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread 1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread 2", 700);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread 3", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Programa finalizado!");

    }
}
