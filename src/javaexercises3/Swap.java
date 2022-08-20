package javaexercises3;

import java.util.Scanner;

public class Swap {
    public static boolean swap (int [] array1, int [] array2) {
        if(array1.length == array2.length) {
            for(int idx = 0; idx < array1.length; idx++) {
                int temp = array1[idx];
                array1[idx] = array2[idx];
                array2[idx] = temp;
            }
            return true;
        } else {
            return false;
        }
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int lengthArray1;
        int [] array1;
        System.out.printf("Enter the number of array1: ");
        lengthArray1 = sc.nextInt();
        array1 = new int [lengthArray1];
        System.out.printf("Enter the value of all array1(separated by space) : ");
        for(int idx = 0; idx < lengthArray1; idx++) {
            array1[idx] = sc.nextInt();
        }
        final int lengthArray2;
        int [] array2;
        System.out.printf("Enter the number of array2: ");
        lengthArray2 = sc.nextInt();
        array2 = new int [lengthArray2];
        System.out.printf("Enter the value of all array2(separated by space) : ");
        for(int idx = 0; idx < lengthArray2; idx++) {
            array2[idx] = sc.nextInt();
        }
        if(swap(array1, array2)) {
            System.out.printf("Array has been swapped successfully");
        } else {
            System.out.printf("Swap array failed");
        }
        sc.close();
    }
}
