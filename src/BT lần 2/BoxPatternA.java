import java.util.Scanner;

public class BoxPatternA {
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
            for(int col = 1; col <= size; col++) {
                if(row == 1 || row == size || col == 1 || col == size) {
                    System.out.printf("%2s", "#");
                } else {
                    System.out.printf("%2s", "");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
