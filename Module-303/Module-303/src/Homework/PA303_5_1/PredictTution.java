package Homework.PA303_5_1;

public class PredictTution {
    public static void main(String[] args) {
        double tution=10000;
        double targettution=20000;
        double rate=1.07;
        int years=0;
        while(tution<targettution){
            tution=tution*rate;
            years++;
        }
        System.out.println("The tuition will be doubled in " + years + " years.");
        System.out.printf("The tuition will be $%.2f in year %d.%n", tution, years);
    }
}
