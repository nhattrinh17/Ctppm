import java.util.Scanner;

public class CheckerPattern{
    public static void main( String [] args ){
        Scanner sc  = new Scanner( System.in );
        int size = 0;
        boolean isInteger = false;
        while(!isInteger) {
            size = sc.nextInt();
            if(size>=1) {
                System.out.printf("Enter the size: %d\n", size);
                isInteger = true;
            } else {
                System.out.println("Invalid size, try again...");
            }
        }

        for(int row = 1; row <= size; row++) {
            if(row % 2 == 0) {
                System.out.print(" ");
            }
            for(int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        sc.close();
    }
}