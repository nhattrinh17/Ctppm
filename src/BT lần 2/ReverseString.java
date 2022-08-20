import java.util.Scanner;

public class ReverseString {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();

        System.out.printf("Enter a String: %s", inStr);
        System.out.printf("The reverse of the String '%s' is ", inStr);
        for(int charIndex = inStrLen - 1; charIndex >= 0; charIndex--) {
            System.out.printf("%s", inStr.charAt(charIndex));
        }
        sc.close();
    }
}