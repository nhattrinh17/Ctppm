package javaexercises4;

import java.util.Scanner;

public class BubbleSort {
    public static int [] bubbleSort (int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
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
        items = bubbleSort(items);
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
