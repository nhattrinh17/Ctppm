import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt() ;
        int number2 = sc.nextInt() ;
        int number3 = sc.nextInt() ;
        int sum = number1+number2+number3;
        int product = number1*number2*number3;
        System.out.printf("Enter 1st integer: %d\n", number1);
        System.out.printf("Enter 2nd integer: %d\n", number2);
        System.out.printf("Enter 3rd integer: %d\n", number3);
        System.out.printf("The sum is: %d\n", sum);
        System.out.printf("The product is: %d\n", product);
        if(number1>=number2 && number1>=number3){
            System.out.printf("The max is: %d\n", number1);
        }else if(number2>=number1 && number2>=number3){
            System.out.printf("The max is: %d\n", number2);
        }else{
            System.out.printf("The max is: %d\n", number3);
        }
        if(number1<=number2 && number1<=number3){
            System.out.printf("The min is: %d\n", number1);
        }else if(number2<=number1 && number2<=number3){
            System.out.printf("The min is: %d\n", number2);
        }else{
            System.out.printf("The min is: %d\n", number3);
        }
        sc.close();
    } 
}
