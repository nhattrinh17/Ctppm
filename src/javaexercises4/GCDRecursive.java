package javaexercises4;

import java.util.Scanner;

public class GCDRecursive {
    public static int gcd (int a, int b) {
        
        if (b == 0) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a  = sc.nextInt();
        System.out.print("Enter number b: ");
        int b  = sc.nextInt();
        System.out.println("Gcd of a and b is: " + gcd(a, b));
        sc.close();
    }
}
