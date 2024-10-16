package Homework.GLAB303_3_1;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String vowels = "Sushma is a good girl";
        String[] result = vowels.split(" ");
        System.out.println(Arrays.toString(result));
        //System.out.println("result = " + Arrays.toString(result));

    }
}
