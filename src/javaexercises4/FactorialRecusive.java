package javaexercises4;

import java.util.Scanner;

public class FactorialRecusive {
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number to calculate factorial: ");
        int number = sc.nextInt();
        System.out.printf("Factorial of number %d : %d", number, factorial(number));
        sc.close();
    }
}
