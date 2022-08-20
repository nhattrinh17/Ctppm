package javaexercises3;

import java.util.Scanner;

public class PrintArrayInStars {
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
        for(int idx = 0; idx < NUM_ITEMS; idx++) {
            System.out.printf("%d: ", idx);
            // Print value as the number of stars
            for(int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.printf("*");
            }
            System.out.printf("( %d )\n", items[idx]);
        }

        sc.close();
    }
}
