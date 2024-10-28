package Homework.PA303_7_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int numberOfThings = sc.nextInt();
        sc.nextLine();
        String[] favoriteThings = new String[numberOfThings];
        for (int i = 0; i < numberOfThings; i++) {
            System.out.print("Enter your thing: ");
            favoriteThings[i] = sc.nextLine();
        }
        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.print(thing + " ");
        }
        sc.close();
    }
}
