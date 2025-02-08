package Homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] inputNumbers = new double[5];

        System.out.println("Enter 5 double numbers, please: ");
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println("Enter number" + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextDouble();
        }

        System.out.println("The array content is: ");
        for(double i:inputNumbers){
            System.out.println(i);
        }
    }
}
