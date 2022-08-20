import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int lowerbound = sc.nextInt();
        int upperbound = sc.nextInt();
        int sum = 0;
        int tg = lowerbound;
        double average = (lowerbound + upperbound) / 2;
        // use a while
        while(tg <= upperbound){
            sum+=tg;
            tg++;
        }
        // use a for
        // for(int number = lowerbound; number<= upperbound; number++){
        //     sum+=number;
        // }
        //find the ”sum of the squares” of all the numbers from 1 to 100,i.e. 1 ∗1 + 2 ∗2 + 3 ∗3 + ... + 100 ∗100.
        int sumSquares = 0;
        for(int i = 1; i<=100; i++){
            sumSquares+= (i*i);
        }
        // the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100.
        int sumOod = 0;
        int sumEven = 0;
        for(int i = 1; i<=100; i++){
            if(i%2 == 0){
                sumEven+=i;
            }else{
                sumOod+=i;
            }
        }
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average "+ average);
        System.out.println("The sum squares of 1 to 100 is" + sumSquares);
        System.out.println("The sum ood of 1 to 100 is " + sumOod);
        System.out.println("The sum even of 1 to 100 is " + sumEven);
        sc.close();
    }
}
