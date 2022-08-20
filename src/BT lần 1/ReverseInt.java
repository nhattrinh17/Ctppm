import java.util.Scanner;
import java.lang.Math;

public class ReverseInt {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt() ;
        int number1 = number;
        int inDigit = 0;
        int amount = 0;
        while(number1 > 0 ){
            amount++;
            number1 = number1 / 10;
        }
        while(number > 0 ){
            inDigit += ( number%10 ) * Math.pow(10, amount-1);
            number = number / 10;
            amount--;
        }
        System.out.printf("The Reverse is: %d", inDigit);
        sc.close();
    }
}
