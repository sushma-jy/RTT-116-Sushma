package Homework.GLAB303_6_1;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr={12,21,6,16,8};
        System.out.println("The Length of array is " +arr.length);
        System.out.println("printing elements using loops");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element in the position " +i+ " is " +arr[i]);
        }

    }
}
