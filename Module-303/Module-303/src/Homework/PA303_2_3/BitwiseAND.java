package Homework.PA303_2_3;

public class BitwiseAND {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z = x & y;
        System.out.println("Value of x: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
        System.out.println("Value of y: " + y + " (Binary: " + Integer.toBinaryString(y) + ")");
        System.out.println("Result of x & y (z): " + z + " (Binary: " + Integer.toBinaryString(z) + ")");
        int a = x | y;
        System.out.println("Value of x: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
        System.out.println("Value of y: " + y + " (Binary: " + Integer.toBinaryString(y) + ")");
        System.out.println("Result of x | y (z): " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
    }
}
