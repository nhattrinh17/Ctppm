import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        double sum = 2.00;
        System.out.printf("The first %d Fibonaci number are : \n", n);
        System.out.printf("1 1 ");
        for(int i=3; i<=n; i++){
            int fn3 = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = fn3;
            sum+=fn3;
            System.out.printf("%d ", fn3);
        }
        System.out.println();
        double average = sum/n;
        System.out.printf("The average is %.2f", average);
        sc.close();
    }
}
