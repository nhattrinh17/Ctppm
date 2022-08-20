package javaexercises4;

public class FactorialInt {
    
    public static long factorial (int number) {
        long result = 1;
        for(int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }

    public static void main (String [] args) {
        boolean limit = true;
        int number = 1;
        while (limit) {
            if (factorial(number) <= Integer.MAX_VALUE) {
                System.out.printf("The factorial of %d is %d \n", number, factorial(number));
                number++;
            }else {
                System.out.println("The factorial of " + number + " is out of range");
                limit = false;
            }
        }
    }

}
