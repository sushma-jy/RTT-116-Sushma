package Homework.PA303_7_1;

public class Task10 {
    public static void main(String[] args) {
        Object[] mixedArray = {42, "Hello", "Java", "Programming", 3.14};
        System.out.print("Array elements: ");
        for (Object element : mixedArray) {
            System.out.print(element + " ");
        }
    }
}
