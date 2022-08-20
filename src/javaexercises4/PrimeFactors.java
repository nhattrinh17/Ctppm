package javaexercises4;

import java.util.Scanner;

public class PrimeFactors {
    public static boolean isPrimeFactors (int number) {
        PrimeNumbers prime = new PrimeNumbers();
        int sumMultiply = 1;
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && prime.isPrime(i)) {
                sumMultiply *= i;
            }
        }
        if (sumMultiply == number) {
            return true;
        } 
        return false;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the upper bound :");
        int numberUpper = sc.nextInt();
        double countFrime = 1.00;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 1; i <= numberUpper; i++) {
            if (isPrimeFactors(i)) {
                System.out.printf("%d ", i);
                countFrime++;
            }
        }
        double ratioPrime = countFrime / numberUpper * 100;
        System.out.println();
        System.out.printf("[%.0f numbers found (%.2f%%)]\n", countFrime, ratioPrime);
        sc.close();
    }
}
