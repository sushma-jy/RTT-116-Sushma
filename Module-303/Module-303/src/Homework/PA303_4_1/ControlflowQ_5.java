package Homework.PA303_4_1;

import java.util.Scanner;

public class ControlflowQ_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score=scanner.nextInt();
        if(score>=90&&score<=100){
            System.out.println("A");
        }
        else if(score>=80&&score<90){
            System.out.println("B");
        }
        else if(score>=70&&score<80){
            System.out.println("C");
        }
        else if(score>=60&&score<70){
            System.out.println("D");
        }
        else if(score<60){
            System.out.println("F");
        }
        scanner.close();
    }
}
