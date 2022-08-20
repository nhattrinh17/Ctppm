import java.util.Scanner;

public class ExchangeCipher {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();
        int inStrLeng = inString.length();
        System.out.printf("Enter a plaintext tring: %s\n", inString);
        System.out.printf("The ciphertext string is: ");
        inString = inString.toUpperCase();
        for(int i = 0; i < inStrLeng; i++){
            char charCaesar = inString.charAt(i);
            // charCaesar = 219 - charCaesar;
            System.out.printf("%c", charCaesar);
        } 
        sc.close(); 
    }
}
