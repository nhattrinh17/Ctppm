import java.util.Scanner;

public class PhoneKey_Pad {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        int inStrLeng = inStr.length();

        for(int i = 0; i <= inStrLeng - 1; i++) {
            switch(inStr.charAt(i)) {
                case 'a' :
                case 'b' :
                case 'c' :
                    System.out.printf("%d", 2);
                    break;
                case 'd' :
                case 'e' :
                case 'f' :
                    System.out.printf("%d", 3);
                    break;
                case 'g' :
                case 'h' :
                case 'i' :
                    System.out.printf("%d", 4);
                    break;
                case 'j' :
                case 'k' :
                case 'l' :
                    System.out.printf("%d", 5);
                    break;
                case 'm' :
                case 'n' :
                case 'o' :
                    System.out.printf("%d", 6);
                    break;
                case 'p' :
                case 'q' :
                case 'r' :
                case 's' :
                    System.out.printf("%d", 7);
                    break;
                case 't' :
                case 'u' :
                case 'v' :
                    System.out.printf("%d", 8);
                    break;
                case 'w' :
                case 'x' :
                case 'y' :
                case 'z' :
                    System.out.printf("%d", 9);
                    break;
                case ' ' :
                    System.out.printf("%d", 0);
                default: {
                    break;
                }
            }
        }

        sc.close();
    }
}
