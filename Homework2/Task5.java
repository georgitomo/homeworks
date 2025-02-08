package Homework2;

public class Task5 {
    public static void main(String[] args) {
        int[] arrayOne = {10, 12, 1, 8, 4};
        int[] arrayTwo = new int[arrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }
        System.out.println("ArrayTwo values: ");
        for (int i : arrayTwo) {
            System.out.println(i);
        }
    }
}
