package javaexercises4;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void binarySearch (int [] array, int key, int fistIdx, int lastIdx) {
        if (fistIdx == lastIdx - 1) {
            if (array[fistIdx] == key) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            int middleIdx = (fistIdx + lastIdx) / 2;
            if (array[middleIdx] == key) {
                System.out.println(true);
            } else if (array[middleIdx] < key) {
                fistIdx = middleIdx;
                binarySearch(array, key, fistIdx, lastIdx);
            } else {
                lastIdx= middleIdx;
                binarySearch(array, key, fistIdx, lastIdx);
            }
        }
    }

    public static void binarySearch (int [] array, int key) {
        int fistIdx = 0;
        int lastIdx = array.length;
        if (fistIdx == lastIdx - 1) {
            if (array[fistIdx] == key) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            int middleIdx = (fistIdx + lastIdx) / 2;
            if (array[middleIdx] == key) {
                System.out.println(true);
            } else if (array[middleIdx] < key) {
                fistIdx = middleIdx;
                binarySearch(array, key, fistIdx, lastIdx);
            } else {
                lastIdx= middleIdx;
                binarySearch(array, key, fistIdx, lastIdx);
            }
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
        System.out.printf("Enter the number you want to search: ");
        int key = sc.nextInt();
        System.out.printf("Enter search range(separated by space) : ");
        int fistIdx = sc.nextInt();
        int lastIdx = sc.nextInt();
        binarySearch(items, key, fistIdx, lastIdx);
        binarySearch(items, key);
        sc.close();
    }
}
