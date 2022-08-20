package javaexercises4;

import java.util.Scanner;

public class FibonacciRecursive {
    
    public static int fibonacci (int n) {
        if (n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number to calculate fibonacci: ");
        int number = sc.nextInt();
        System.out.printf("fibonacci of number %d : %d", number, fibonacci(number));
        sc.close();
    }

}
