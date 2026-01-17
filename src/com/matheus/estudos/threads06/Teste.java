package com.matheus.estudos.threads06;

public class Teste {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("Thread 1");
        MinhaThread t2 = new MinhaThread("Thread 2");

        System.out.println("Pausando a Thread 1");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Pausando a Thread 2");

        t2.suspend();

        System.out.println("Resumindo a Thread 1");

        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.resume();

        t2.stop();
    }
}
