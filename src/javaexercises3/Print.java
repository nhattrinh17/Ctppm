package javaexercises3;

public class Print {
    
    public static void print (int [] array) {
        System.out.printf("The values are: ");
        for(int idx = 0; idx < array.length; idx++) {
            if(idx == array.length - 1) {
                System.out.printf("%2d", array[idx]);
            } else {
                System.out.printf("%2d,", array[idx]);
            }
        }
    }

    public static void print (double [] array) {
        System.out.printf("The values are: ");
        for(int idx = 0; idx < array.length; idx++) {
            if(idx == array.length - 1) {
                System.out.printf("%2d", array[idx]);
            } else {
                System.out.printf("%2d,", array[idx]);
            }
        }
    }

    public static void print (float [] array) {
        System.out.printf("The values are: ");
        for(int idx = 0; idx < array.length; idx++) {
            if(idx == array.length - 1) {
                System.out.printf("%2d", array[idx]);
            } else {
                System.out.printf("%2d,", array[idx]);
            }
        }
    }
}
