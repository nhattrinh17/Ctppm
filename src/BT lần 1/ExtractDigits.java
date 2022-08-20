import java.util.Scanner;

public class ExtractDigits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt() ;
        while(number > 0 ){
            System.out.printf("%d ", number%10);
            number = number/10;
        }
        sc.close();
    }
}
