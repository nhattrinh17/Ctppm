import java.util.Scanner;

public class CountVowelsDigits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine().toLowerCase();
        int inStrLen = inStr.length();
        double digits = 0.0;
        double vowels = 0.0;
        double ratioDigits = 0.0;
        double ratioVowels = 0.0;
        System.out.printf("Enter a String: %s\n", inStr);

        for(int charIndex = inStrLen - 1; charIndex >= 0; charIndex--) {
            if(inStr.charAt(charIndex) >= '0' && inStr.charAt(charIndex) <= '9') {
                digits ++;
            } else if(inStr.charAt(charIndex) < '0') {
                vowels++;
            }
        }
        
        ratioDigits = digits / inStrLen;
        ratioVowels = vowels / inStrLen;
        System.out.printf("Number of vowels :%2.0f  (%.2f)\n",vowels, ratioVowels);
        System.out.printf("Number of digits :%2.0f  (%.2f)",digits, ratioDigits);
        sc.close();
    }
}
