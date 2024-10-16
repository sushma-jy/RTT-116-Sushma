package Homework.PA303_2_3;

public class IncrementTypes {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Initial value of x: " + x);
        x++;
        System.out.println("After postfix increment (x++): " + x);
        ++x;
        System.out.println("After prefix increment (++x): " + x);
        x = x + 1;
        System.out.println("After adding 1 explicitly (x = x + 1): " + x);
    }
}
