package javaexercises3;

import java.util.Scanner;

public class Exponent {
    // exponentiation function
    public static int exponent (int base, int exp) {
        int exponential = 1;
        for(int i = 1; i <= exp; i++) {
            exponential *= base;
        }
        return exponential;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the base : ");
        int base = sc.nextInt();
        System.out.printf("Enter the exp : ");
        int exp = sc.nextInt();
        System.out.printf("%d raises to the power of %d is: %d", base, exp, exponent(base, exp));
        sc.close();
    }
}
