package javaexercises4;

import java.util.Scanner;

public class TrigonometricSeries {
    
    public static double sin(double x, int numTerms) {
        double sum = 0.00;
        double subValue = 1.00;
        int sign = 1;
        for (int i = 1; i < numTerms; i++) {
            subValue *= x / i;
            if (i % 2 == 1) {
                sum += (sign * subValue);
                sign *= -1;
            }
        }
        return sum;
    }
    public static double cos(double x, int numTerms) {
        double sum = 0.00;
        double subValue = 1.00;
        int sign = 1;
        for (int i = 1; i < numTerms; i++) {
            subValue *= x / i;
            if (i == 1) {
                sum += 1;
                sign *= -1;
            } else if (i % 2 == 0) {
                sum += (sign * subValue);
                sign *= -1;
            }
        }
        return sum;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a value for x: ");
        double x = sc.nextDouble();
        System.out.printf("Enter a value for numTerms: ");
        int numTerms = sc.nextInt();
        System.out.printf("The value of sin is: %.2f\n", sin(x, numTerms));
        System.out.printf("The value of sin is(Math): %.2f\n", Math.sin(Math.PI / 3));
        
        System.out.printf("The value of cos is: %.2f\n", cos(x, numTerms));
        System.out.printf("The value of cos is(Math): %.2f\n", Math.cos(Math.PI / 3));
        sc.close();
    }
}
