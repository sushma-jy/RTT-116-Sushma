package Homework.PA303_7_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] colors = {"red","green","blue","yellow"};
        System.out.println("The length of an array is: " + colors.length);
        String[] colorscopy=colors.clone();
        System.out.println("original array is: " + Arrays.toString(colors));
        System.out.println("copy array is: " + Arrays.toString(colorscopy));
    }
}
