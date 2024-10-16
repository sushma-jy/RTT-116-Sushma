package Homework.PA303_2_1;

public class DivisionByTypeConversion {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("Integer division: " + q);
        double DoubleNumerator =(double)y/x;
        System.out.println("Division after casting y to double: " + DoubleNumerator);
    }
}
