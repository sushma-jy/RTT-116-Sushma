package Homework.PA303_2_3;

public class leftshift {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 9;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 17;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 88;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("After left shift by 1:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
    }
}
