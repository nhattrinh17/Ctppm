package javaexercises4;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static boolean isPerfect (int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient (int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum < number) {
            return true;
        }
        return false;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the upper bound :");
        int numberUpper = sc.nextInt();
        double countFerfect = 0.00;
        double countDeficient = 0.00;
        System.out.println("These numbers are perfect:");
        for (int i = 1; i < numberUpper; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d ", i);
                countFerfect++;
            }
        }
        double ratioPerfect = countFerfect / numberUpper * 100;
        System.out.println();
        System.out.printf("[%.0f perfect numbers found (%.2f%%)]\n", countFerfect, ratioPerfect);
        System.out.println("These numbers are neither deficient nor perfect:");
        for (int i = 1; i < numberUpper; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                System.out.printf("%d ", i);
                countDeficient++;
            }
        }
        double ratioDeficient = countDeficient / numberUpper % 100;
        System.out.println();   
        System.out.printf("[%.0f numbers found (%.2f%%)]\n", countDeficient, ratioDeficient);
        sc.close();
    }
}
