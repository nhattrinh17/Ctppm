package javaexercises3;

import java.util.Scanner;

public class CopyOfArray {
    // Array copy function
    public static int [] copyOf(int [] array) {
        int [] arrayCopy = new int [array.length];
        for(int idx = 0; idx < array.length; idx++) {
            arrayCopy[idx] = array[idx];
        }
        return arrayCopy;
    }
    public static int [] copyOf(int [] array, int newLeng) {
        int [] arrayCopy = new int [newLeng];
        for(int idx = 0; idx < newLeng; idx++) {
            if(idx <= array.length - 1) {
                arrayCopy[idx] = array[idx];
            } else {
                arrayCopy[idx] = 0;
            }
        }
        return arrayCopy;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int arrayLeng1;
        int [] array;
        int [] arrayCopy;
        System.out.printf("Enter the number of array: ");
        arrayLeng1 = sc.nextInt();
        array = new int [arrayLeng1];
        System.out.printf("Enter the value of all array(separated by space) : ");
        for(int idx = 0; idx < arrayLeng1; idx++) {
            array[idx] = sc.nextInt();
        }
        arrayCopy = copyOf(array);
        System.out.printf("The array value just copied is: ");
        for(int idx = 0; idx < arrayLeng1; idx++) {
            if(idx == 0) {
                System.out.printf("[%d,", arrayCopy[idx]);
            } else if(idx == arrayLeng1 - 1) {
                System.out.printf("%2d]", arrayCopy[idx]);
            } else {
                System.out.printf("%2d,", arrayCopy[idx]);
            }
        }
        sc.close();
    }
}
