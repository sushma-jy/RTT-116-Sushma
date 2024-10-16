package Homework.PA303_2_1;
import java.text.DecimalFormat;

public class CafeBill {
    public static void main(String[] args) {
        double coffeePrice = 2.5;
        double cappuccinoPrice = 3.75;
        double espressoPrice = 2.0;

        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;

        double subtotal = (coffeePrice * coffeeQuantity) +
                (cappuccinoPrice * cappuccinoQuantity) +
                (espressoPrice * espressoQuantity);

        final double SALES_TAX = 0.08;
        double totalSale = subtotal + (subtotal * SALES_TAX);

         DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Total Sale (with tax): $" + df.format(totalSale));
    }
}
