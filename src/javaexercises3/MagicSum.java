package javaexercises3;

import java.util.Scanner;

public class MagicSum {
    // check function number contains the digit 8 
    public static boolean hasEight (int number) {
        while(number / 10 != 0) {
            if(number % 10 == 8) {
                return true;
            } else {
                number /= 10;
            }
        }
        if(number == 8) {
            return true;
        }
        return false;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        int magicSum = 0;
        System.out.print("Enter a positive integer(or -1 to end): ");
        int number = sc.nextInt();
        while(number != SENTINEL) {
            if(hasEight(number)) {
                magicSum += number;
            }
            System.out.print("Enter a positive integer(or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.printf("The magic sum is: %d", magicSum);
        sc.close();
    }

}
