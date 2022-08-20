package javaexercises3;

import java.util.Scanner;

public class ArrayToString {

    // Array to string conversion function
    public static String arrayToString(int [] array) {
        String arrayStr = "";
        for(int idx = 0; idx < array.length; idx++) {
            if(idx == 0) {
                arrayStr += ("[" + array[idx] + ","); 
            } else if(idx == array.length - 1) {
                arrayStr += (array[idx] + "]"); 
            } else {
                arrayStr += (array[idx] + ","); 
            }
        }
        return arrayStr;
    }

    // Test function
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int [] items;
        System.out.printf("Enter the number ofitems: ");
        NUM_ITEMS = sc.nextInt();
        items = new int [NUM_ITEMS];
        System.out.printf("Enter the value of alli tems(separated by space) : ");
        for(int idx = 0; idx < NUM_ITEMS; idx++) {
            items[idx] = sc.nextInt();
        }
        System.out.println(arrayToString(items));
        sc.close();
    }
}
