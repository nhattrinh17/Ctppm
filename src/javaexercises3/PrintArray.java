package javaexercises3;

import java.util.Scanner;

public class PrintArray {
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
        System.out.printf("The values are: ");
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
