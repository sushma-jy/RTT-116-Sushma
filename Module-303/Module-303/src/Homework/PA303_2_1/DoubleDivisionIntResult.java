package Homework.PA303_2_1;

public class DoubleDivisionIntResult {
    public static void main(String[] args) {
        double num1 = 20.5;
        double num2 = 10.2;
        double division = num1 / num2;
        System.out.println(division);
        int divisionAsInt = (int) division;
        System.out.println("Result after casting to integer: " + divisionAsInt);
    }
}
