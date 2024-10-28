package Homework.PA303_7_1;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        System.out.println("The value of first index is numbers[0] is "+numbers[0]);
        System.out.println("The value of last index is numbers[" +(numbers.length-1)+  "is "+numbers[(numbers.length-1)]);
        try{
            System.out.println(numbers[(numbers.length)]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try{
            numbers[5]=21;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
