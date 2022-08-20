package javaexercises4;

import java.util.Scanner;

public class SelectionSort {
    public static int [] selectionSort (int [] array) {
        int n = 0;
        while (n <= array.length - 1) {
            int arrayMin = array[n];
            int idxMin = n;
            for (int i = n; i < array.length; i++) {
                if (array[i] < arrayMin) {
                    arrayMin = array[i];
                    idxMin = i;
                }
            }
            int temp = array[n];
            array[n] = arrayMin;
            array[idxMin] = temp;
            n++;
        }
        return array;
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
        items = selectionSort(items);
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
