package Module303_4;

import java.util.Scanner;

public class LeapYearchecking {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        if((year%4==0) && (year%100!=0)){
            System.out.println("Leap Year");
        }else if(year%400==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
