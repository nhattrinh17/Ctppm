package javaexercises4;

import java.util.Scanner;

public class PrimeNumbers {
    public boolean isPrime (int number) {
        if (number == 1) return true;
        int sumdivisible = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sumdivisible ++;
            }
        }
        if (sumdivisible == 2) {
            return true;
        } 
        return false;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumbers prime = new PrimeNumbers();
        System.out.printf("Enter the upper bound :");
        int numberUpper = sc.nextInt();
        double countFrime = 0.00;
        System.out.println("These numbers are prime:");
        for (int i = 1; i <= numberUpper; i++) {
            if (prime.isPrime(i)) {
                System.out.printf("%d ", i);
                countFrime++;
            }
        }
        double ratioPrime = countFrime / numberUpper * 100;
        System.out.println();
        System.out.printf("[%.0f prime found (%.2f%%)]\n", countFrime, ratioPrime);
        sc.close();
    }
}
