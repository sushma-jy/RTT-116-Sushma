package Homework.PA303_2_3;

public class rightshift {
    public static void main(String[] args) {
        int x = 150;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 225;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 1555;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        System.out.println();
        x = 32456;
        System.out.println("Original value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("After right shift by 2:");
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary string of x: " + Integer.toBinaryString(x));
    }
}
