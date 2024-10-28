package Homework.PA303_7_1;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*2;
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
