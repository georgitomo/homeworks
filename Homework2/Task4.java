package Homework2;

public class Task4 {
    public static void main(String[] args) {
        int[] tenIntArray = {11, 12, 13, 14, 15,
                16, 17, 18, 19, 20};

        for (int i = 0; i < tenIntArray.length; i++) {
            System.out.println(tenIntArray[i]);
        }
        int iterator = 0;
        while (iterator < tenIntArray.length) {
            System.out.println(tenIntArray[iterator]);
            iterator ++;
        }
    }
}
