package javaexercises3;

import java.util.Scanner;

public class Hex2Bin {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] hexBits = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };
        System.out.printf("Enter a Hexa decimal string: ");
        String hexString = sc.nextLine();
        System.out.printf("The equivalent binary for hexadecimal ”%s” is : ", hexString);
        for(int i = 0; i < hexString.length(); i++) {
            if(Character.isDigit(hexString.charAt(i))) {
                int index = Character.getNumericValue(hexString.charAt(i));
                System.out.printf("%2s ", hexBits[index]);
            } else {
                int index = Character.digit(hexString.charAt(i), hexBits.length);
                System.out.printf("%2s ", hexBits[index]);
            }
        }
        sc.close();
    }
}
