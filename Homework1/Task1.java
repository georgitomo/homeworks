package Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("First number is: " + firstNumber);

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Second number is: " + secondNumber);

        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        if (thirdNumber >= firstNumber && thirdNumber <= secondNumber) {
            System.out.println("Third number is between first and second");
        } else {
            System.out.println("Third number is not between first and second");
        }
    }
}



