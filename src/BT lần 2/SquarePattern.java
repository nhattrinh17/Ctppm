import java.util.Scanner;

public class SquarePattern{
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

        // use for loop
        System.out.println("Use for loop");
        for(int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        // use while-do
        System.out.println("Use while-do loop");
        int row = 1;
        int col = 1;
        do {
            do {
                System.out.print("# ");
                col++;
            } while(col<=size);
            System.out.printf("\n");
            row++;
            col = 1; 
        } while(row<=size);
        sc.close();
    }
}