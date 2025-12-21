package com.matheus.estudos.threads01;

public class Main {
    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread-1", 600);
        MinhaThread thread2 = new MinhaThread("Thread-2", 2000);
    }
}
