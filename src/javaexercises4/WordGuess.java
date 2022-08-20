package javaexercises4;

import java.util.Scanner;

public class WordGuess {
    public static void replaceAndPrint( char [] arrayChar, char [] arrayCharReplace, char charInsert) {
        for (int index = 0; index < arrayCharReplace.length; index++) {
            if (arrayChar[index] == charInsert) {
                arrayCharReplace[index] = charInsert;
            }
        }
        for (int index = 0; index < arrayCharReplace.length; index++) {
            System.out.printf(" %c", arrayCharReplace[index]);
            if (index == arrayCharReplace.length - 1) {
                System.out.println();
            }
        }
    }

    public static boolean equals (char [] array1, char [] array2) {
        if (array1.length == array2.length) {
            for (int idx = 0; idx < array1.length; idx++) {
                if (array1[idx] != array2[idx]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        final String SECRET_STRING = sc.nextLine();
        System.out.printf("Java WordGuess %s\n", SECRET_STRING);
        char [] arrayChar = SECRET_STRING.toCharArray();
        char [] arrayCharCopy = new char [arrayChar.length];
        for (int i = 0; i < arrayCharCopy.length; i++) {
            arrayCharCopy[i] = '_';
        }
        int inputCount = 1;
        boolean finish = false;
        while(!finish) {
            System.out.printf("Key in one character or your guess word :");
            String userInput = sc.nextLine();
            if (userInput.equals(SECRET_STRING)) {
                System.out.println("Congratulation !");
                finish = true;
            } else if (userInput != SECRET_STRING && userInput.length() > 1){
                inputCount++;
            } else {
                char inputChar = userInput.charAt(0);
                System.out.printf("Trial %d: ", inputCount);
                replaceAndPrint(arrayChar, arrayCharCopy, inputChar);
                if (equals(arrayChar, arrayCharCopy)) {
                    System.out.println("Congratulation !");
                    finish = true;
                } else {
                    inputCount++;
                }
            }
        }
        System.out.printf("You got in %d reials", inputCount);
        sc.close();
    }
}
