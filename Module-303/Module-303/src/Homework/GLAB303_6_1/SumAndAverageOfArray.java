package Homework.GLAB303_6_1;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,7,-3,9,-5,6,11};
        double sum=0.0;
        double avg=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            avg=sum/arr.length;
        }
        System.out.println("Sum of the array is " + sum);
        System.out.println("Average of the array is " + avg);
    }
}
