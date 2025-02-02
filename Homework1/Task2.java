package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter double number: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter int number: ");
        int thirdNumber = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter double number: ");
        double fourthNumber = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("First number is: " + firstNumber);
        System.out.println("Second number is: " + secondNumber);
        System.out.println("Third number is: " + thirdNumber);
        System.out.println("Fourth number is: " + fourthNumber);

        double swapFirstCouple = firstNumber;
        firstNumber = (int) secondNumber;
        secondNumber = swapFirstCouple;
        double sum = firstNumber + secondNumber;

        System.out.println("Swapped firstNumber: " + firstNumber +
                ", Swapped secondNumber: " + secondNumber +
                ", Sum of swapped numbers: " + sum);

        double swapSecondCouple = thirdNumber;
        thirdNumber = (int) fourthNumber;
        fourthNumber = swapSecondCouple;
        double sumTwo = thirdNumber + fourthNumber;

        System.out.println("Swapped thirdNumber: " + thirdNumber +
                ", Swapped fourthNumber: " + fourthNumber +
                ", Sum of swapped numbers: " + sumTwo);

        scanner.close();
    }
}
