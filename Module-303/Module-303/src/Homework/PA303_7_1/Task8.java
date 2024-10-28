package Homework.PA303_7_1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"S","U","S","H","M","A","Y"};
        int middle=arr.length/2;
        String temp=arr[0];
        arr[0]=arr[middle];
        arr[middle]=temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }

}

