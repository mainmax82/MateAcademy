package Controlling.Ex9;

import java.util.Scanner;

public class FibonacciEx9 {

    int fib(int n) {
        if (n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Enter positive number");

        FibonacciEx9 f = new FibonacciEx9();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("First " + k + " Fibonacci number(s): ");
        for (int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }
}

