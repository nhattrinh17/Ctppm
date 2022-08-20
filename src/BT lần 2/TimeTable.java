import java.util.Scanner;

public class TimeTable {
    public static void main(String [] args){
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

        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= size; j++) {
                if(i == 0) {
                    if(j == 0) {
                        System.out.printf("%4s  |", "*");
                    } else {
                        System.out.printf("%4d", j);
                    }
                } else {
                    if(j == 0) {
                        System.out.printf("%4d  |", i);
                    }else {
                        System.out.printf("%4d", i*j);
                    }
                }                
            }
            System.out.println();
        }
        sc.close();
    }
}
