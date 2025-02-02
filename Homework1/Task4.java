package Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter working hours: ");
        int workingHours = scanner.nextInt();

        System.out.println("Enter amount of money: ");
        double money = scanner.nextDouble();

        System.out.println("Is it a weekend?: ");
        boolean isWeekend = scanner.nextBoolean();

        if (!isWeekend) {
            System.out.println("I will work.");
        } else {
            if (money > 10) {
                System.out.println("I will go to the cinema.");
            } else if (money < 10) {
                System.out.println("I will eat ice cream.");
            } else {
                System.out.println("I will stay at home and watch TV.");
            }
        }

        scanner.close();
    }
}

