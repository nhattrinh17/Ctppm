package javaexercises4;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch (int [] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex (int [] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int [] items;
        System.out.printf("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int [NUM_ITEMS];
        System.out.printf("Enter the value of all items(separated by space) : ");
        for(int idx = 0; idx < NUM_ITEMS; idx++) {
            items[idx] = sc.nextInt();
        }
        System.out.printf("Enter the number you want to search: ");
        int key = sc.nextInt();
        if (linearSearch(items, key)) {
            System.out.printf("The position of the number to look up is: %d", linearSearchIndex(items, key));
        } else {
            System.out.printf("Number to look up is not in the array");
        }
        sc.close();
    }
}
