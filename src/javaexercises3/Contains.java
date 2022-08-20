package javaexercises3;

import java.util.Scanner;

public class Contains {
    public static boolean contains (int [] array, int key) {
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] == key) {
                return true;
            }
        }
        return false;
    } 

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int [] items;
        System.out.printf("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int [NUM_ITEMS];
        System.out.printf("Enter the value of alli tems(separated by space) : ");
        for(int idx = 0; idx < NUM_ITEMS; idx++) {
            items[idx] = sc.nextInt();
        }
        System.out.printf("Enter the number to check: ");
        int key = sc.nextInt();
        if(contains(items, key)) {
            System.out.printf("The entered number exists in the array!");
        } else {
            System.out.printf("The entered number does not exist in the array!");
        }
        sc.close();
    }
}
