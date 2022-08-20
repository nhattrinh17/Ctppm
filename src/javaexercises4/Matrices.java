package javaexercises4;

import java.util.Scanner;

public class Matrices {

    //Method signatures
    public static void print (int [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void print (double [][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension (int [][] matrix1, int [][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }

    public static boolean haveSameDimension (double [][] matrix1, double [][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }

    // Used in add, subtract, multiply
    public static int[][] add (int [][] matrix1, int [][] matrix2) {
        int [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new int [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] add (double [][] matrix1, double [][] matrix2) {
        double [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new double [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] subtract (int [][] matrix1, int [][] matrix2) {
        int [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new int [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] subtract (double [][] matrix1, double [][] matrix2) {
        double [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new double [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiply (int [][] matrix1, int [][] matrix2) {
        int [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new int [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] * matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] multiply (double [][] matrix1, double [][] matrix2) {
        double [][] result;
        if (!haveSameDimension(matrix1, matrix2)) {
            result = null;
            return result;
        }
        result = new double [matrix1.length][matrix1[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    //Check the program
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix1;
        System.out.printf("Enter maxtric1 row: ");
        int rowMatrix1 = sc.nextInt();
        System.out.printf("Enter maxtric1 col: ");
        int colMatrix1 = sc.nextInt();
        matrix1 = new int[rowMatrix1][colMatrix1];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                System.out.printf("Enter a value for matrix1[%d][%d]: ", row, col);
                matrix1[row][col] = sc.nextInt();
            }
        }
        int [][] matrix2;
        System.out.printf("Enter maxtric1 row: ");
        int rowMatrix2 = sc.nextInt();
        System.out.printf("Enter maxtric1 col: ");
        int colMatrix2 = sc.nextInt();
        matrix2 = new int[rowMatrix2][colMatrix2];
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                System.out.printf("Enter a value for matrix2[%d][%d]: ", row, col);
                matrix2[row][col] = sc.nextInt();
            }
        }
        System.out.printf("The values matrix1 add matrix2 are: \n");
        print(add(matrix1, matrix2));
        System.out.printf("The values matrix1 subtract matrix2 are: \n");
        print(subtract(matrix1, matrix2));
        System.out.printf("The values matrix1 multypil matrix2 are: \n");
        print(multiply(matrix1, matrix2));
        sc.close();
    }
}
