package javaexercises3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static void redGrades () {
        Scanner sc = new Scanner(System.in);
        final int arrayLength;
        int [] array;
        System.out.printf("Enter the number of array: ");
        arrayLength = sc.nextInt();
        array = new int [arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.printf("Enter the grade for student%2d: ", i+1);
            array[i] = sc.nextInt();
        }
        gardes = Arrays.copyOf(array, arrayLength);
        sc.close();
    }

    public static void print (int [] array) {
        for(int idx = 0; idx < array.length; idx++) {
            if(idx == 0) {
                System.out.printf("[%d,", array[idx]);
            } else if(idx == array.length - 1) {
                System.out.printf("%2d]\n", array[idx]);
            } else {
                System.out.printf("%2d,", array[idx]);
            }
        }
    }

    public static double average (int [] array) {
        double sum = 0.00;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static double median (int [] array) {
        // double median = Math.floor(average(array));

        double median = 0.00;
        if(array.length % 2 == 0) {
            median = (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    public static int min (int [] array) {
        int minimun = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minimun) {
                minimun = array[i];
            }
        }
        return minimun;
    }
    
    public static int max (int [] array) {
        int maximun = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maximun) {
                maximun = array[i];
            }
        }
        return maximun;
    }

        public static double stdDev (int [] array) {
        double sum = 0.00;
        for(int i = 0; i < array.length - 1; i++) {
            sum += (array[i]*array[i] - median(array) * median(array));
        }
        double stdDev = (1.00 / array.length) * sum;
        // double stdDev = Math.sqrt((1.00 / array.length) * sum);
        return stdDev;
    }

    public static int [] gardes;

    public static void main (String [] args) {
        redGrades();
        System.out.printf("The grades are: ");
        print(gardes);
        System.out.println("The average is: " + average(gardes));
        System.out.printf("The median is: %.2f\n", median(gardes));
        System.out.println("The minimum is: " + min(gardes));
        System.out.println("The maximum is: " + max(gardes));
        System.out.printf("The stand arddeviation is: %.2f\n", stdDev(gardes));
    }
}
