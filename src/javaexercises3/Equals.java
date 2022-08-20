package javaexercises3;

import java.util.Scanner;

public class Equals {
    
    // Function to check 2 arrays are equal
    public static boolean equals (int [] array1, int [] array2) {
        if(array1.length == array2.length) {
            for(int idx = 0; idx < array1.length; idx++) {
                if(array1[idx] != array2[idx]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int lengthArray1;
        final int lengthArray2;
        int [] array1;
        int [] array2;
        System.out.printf("Enter the number of array1: ");
        lengthArray1= sc.nextInt();
        array1 = new int [lengthArray1];
        System.out.printf("Enter the value of all items(separated by space) : ");
        for(int idx = 0; idx < lengthArray1; idx++) {
            array1[idx] = sc.nextInt();
        }
        System.out.printf("Enter the number of array2: ");
        lengthArray2 = sc.nextInt();
        array2 = new int [lengthArray2];
        System.out.printf("Enter the value of all items(separated by space) : ");
        for(int idx = 0; idx < lengthArray2; idx++) {
            array2[idx] = sc.nextInt();
        }
        if(equals(array1, array2)) {
            System.out.printf("The 2 arrays just entered are equal!");
        } else {
            System.out.printf("The 2 arrays just entered are not equal!");
        }
        sc.close();
    }

}
