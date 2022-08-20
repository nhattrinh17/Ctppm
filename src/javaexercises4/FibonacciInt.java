package javaexercises4;

public class FibonacciInt {
    public static long fibonacci (int number) {
        long fibonacciNumber = 0;
        long fnMinus1 = 1;
        long fnMinus2 = 2;
        for(int i=3; i <= number; i++){
            fibonacciNumber = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = fibonacciNumber;
        }
        return fibonacciNumber;
    }

    public static void main (String [] args) {
        int number = 3;
        boolean limit = true;
        System.out.printf("F(0) = 1\n");
        System.out.printf("F(1) = 1\n");
        System.out.printf("F(2) = 2\n");
        while(limit) {
            if (fibonacci(number) <= Integer.MAX_VALUE) {
                System.out.printf("F(%d) = %d\n", number, fibonacci(number));
                number++;
            } else {
                System.out.printf("F(%d) is out of the range of int", number);
                limit = false;
            }
        }
    }
}
