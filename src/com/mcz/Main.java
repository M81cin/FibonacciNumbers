package com.mcz;

import java.util.Scanner;

/**
 * Pobiera od użytkownika informację, ile liczb Fibonacciego należy zwrócić i wywołuje konstruktor klasy do obliczenia tych liczb
 */
public class Main {

    public static void main(String[] args) {

        System.out.print("Podaj, ile liczb Fibonacciego mam zwrócić >");

	    Scanner scan = new Scanner(System.in);
	    while (!scan.hasNextInt()) {
	        System.out.print("To nie jest liczba całkowita. Podaj liczbę całkowitą >");
	        scan.next();
        }
	    int i = scan.nextInt();

	    try {
            Fibonacci f = new Fibonacci(i);
        } catch (Exception e) {
	        System.out.println("Wystąpił wyjątek!");
	        System.out.println(e.toString());
	        System.exit(-1);
        }
    }
}
