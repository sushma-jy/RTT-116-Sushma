package headfirst.practice;

import java.util.Scanner;

public class FibonacciCheck {

    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    if (FibonacciOrNot(num)) {
        System.out.println(num + " is a Fibonacci number.");
    } else {
        System.out.println(num + " is not a Fibonacci number.");
    }

