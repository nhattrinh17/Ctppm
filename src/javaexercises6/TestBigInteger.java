package javaexercises6;

import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 bigInterger:");
        BigInteger number1 = new BigInteger(sc.nextLine(), 20);
        System.out.println("Enter the number2 bigInterger:");
        BigInteger number2 = new BigInteger(sc.nextLine(), 20);
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
        sc.close();
    }
}
