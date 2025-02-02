package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        scanner.nextLine();

        int tempCopy = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = tempCopy;


        System.out.println("3rd number with the value of 1st: " + thirdNumber);


        System.out.println("2nd number with the value of 1st: " + secondNumber);


        System.out.println("1st number with the value of 2nd: " + firstNumber);

        scanner.close();

        int sum = firstNumber + secondNumber;
        int finalResult = sum - thirdNumber;
        System.out.println(finalResult);



    }
}
