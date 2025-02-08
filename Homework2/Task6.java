package Homework2;

public class Task6 {
    public static void main(String[] args){
        int[] arrayOne={1,2,3};
        int[] arrayTwo={1,2,3};

        boolean areArraysIdentical = areIdentical(arrayOne,arrayTwo);

        if(areArraysIdentical){
            System.out.println("They are identical");
        }else{
            System.out.println("Not identical arrays");
        }


    }

    public static boolean areIdentical(int[] arrayOne, int[] arrayTwo){
        if(arrayOne.length != arrayTwo.length){
            return false;
        }

        for(int i =0; i<arrayOne.length;i++){
            if(arrayOne[i] != arrayTwo[i]){
                return false;
            }
        }
        return true;
    }
}
