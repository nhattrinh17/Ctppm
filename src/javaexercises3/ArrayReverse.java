package javaexercises3;

import java.util.Scanner;

public class ArrayReverse {
    public static void reverse (int [] array) {
        int [] arrayCopy = new int [array.length];
        for(int idx = 0; idx < array.length; idx++) {
            arrayCopy[idx] = array[idx];
        }
        int idx2 = array.length - 1;
        for(int idx = 0; idx < array.length; idx++) {
            array[idx] = arrayCopy[idx2];
            idx2--;
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int arrayLength;
        int [] array;
        System.out.printf("Enter the number of array: ");
        arrayLength = sc.nextInt();
        array = new int [arrayLength];
        System.out.printf("Enter the value of all array(separated by space) : ");
        for(int idx = 0; idx < arrayLength; idx++) {
            array[idx] = sc.nextInt();
        }
        reverse(array);
        System.out.printf("The values are: ");
        for(int idx = 0; idx < arrayLength; idx++) {
            if(idx == 0) {
                System.out.printf("[%d,", array[idx]);
            } else if(idx == arrayLength - 1) {
                System.out.printf("%2d]", array[idx]);
            } else {
                System.out.printf("%2d,", array[idx]);
            }
        }
        sc.close();
    }
}
