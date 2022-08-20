package javaexercises4;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int [] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
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
        insertionSort(items);;
        System.out.printf("The array value after sorting is: ");
        for(int idx = 0; idx < NUM_ITEMS; idx++) {
            if(idx == 0) {
                System.out.printf("[%d,", items[idx]);
            } else if(idx == NUM_ITEMS - 1) {
                System.out.printf("%2d]", items[idx]);
            } else {
                System.out.printf("%2d,", items[idx]);
            }
        }
        sc.close();
    }
}
