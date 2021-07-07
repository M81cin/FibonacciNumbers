package com.mcz;

/**
 * Oblicza wskazaną liczbę liczb FIbonacciego i wypisuje je na ekranie
 */
public class Fibonacci {
    private long fib;
    private long fib_last;

    public Fibonacci(int n) {
        fib = -1;
        fib_last = -1;

        if (n>=0) {
            for (int x=0; x<n; x++) {
                if (x == 0) {
                    fib = 0;
                } else if (x == 1) {
                    fib_last = 0;
                    fib = 1;
                } else
                {
                    long temp = fib;
                    fib += fib_last;
                    fib_last = temp;
                }
                if (fib >= 0) {
                    System.out.println("Liczba Fibonacciego [" + (x + 1) + "] = " + fib);
                }
                else
                {
                    System.out.println("Out of range! Program exit");
                    System.exit(-1);
                }

            }
        }
        else
        {
            System.out.println("Wartość musi być dodatnia");
        }
    }
}
