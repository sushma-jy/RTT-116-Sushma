package Homework.PA303_5_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first positive number n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second positive number n2: ");
        int n2 = sc.nextInt();
        int gcd=1;
        for (int k = 1; k <= Math.min(n1, n2); k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        System.out.println("GCD of "+n1+ " and " +n2+ " is : " +gcd);
        sc.close();
    }
}
