package Homework.PA303_7_1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array);
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nThe smallest number is " + array[0]);
        System.out.println("The biggest number is " + array[array.length - 1]);
    }
}
