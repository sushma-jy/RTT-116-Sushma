package Homework.PA303_4_1;

public class ControlflowQ_3 {
    public static void main(String[] args) {
        int x=15;
        //int x=50;
        if(x<10){
            System.out.println("Less than 10");
        }
        else if(x>10&&x<20){
            System.out.println("Greater than 10");
        }
        else if(x>20&&x<30){
            System.out.println("Greater than or equal to 20");
        }
    }
}
