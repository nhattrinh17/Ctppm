package javaexercises4;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java NumberGuess");
        final int SECRET_NUMBER = (int)( Math.random() * 99);
        boolean finish = false;
        int inputCount = 1;
        System.out.println("Key in your guess :");
        while (!finish) {
            int userChooses = sc.nextInt();
            if (userChooses < SECRET_NUMBER) {
                System.out.println("Try higher");
                inputCount++;
            } else if (userChooses > SECRET_NUMBER) {
                System.out.println("Try lower");
                inputCount++;
            } else {
                System.out.printf("You got it in %d trials!", inputCount);
                finish = true;
            }
        }
        sc.close();
    }
}
