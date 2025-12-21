package com.matheus.estudos.threads02;

public class Main {

    public static void main(String[] args) {
        MinhaThreadRunnable runnable = new MinhaThreadRunnable("Thread-Runnable-1", 600);

        MinhaThreadRunnable runnable2 = new MinhaThreadRunnable("Thread-Runnable-2", 2000);

    }
}
