import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int []student = new int[3];
        for(int i=0; i<=2; i++){
            boolean validation = false;
            while(validation == false){
                student[i]= sc.nextInt();
                if( student[i]>=0 && student[i]<=100 ){
                    System.out.printf("You the mark (0-100) for student%d : %d\n", i+1, student[i]);
                    validation = true;
                }else{
                    System.out.printf("Invalid input, try again... \n");
                }
            }
        }
        double sum = 0;
        sum = student[0] + student[1] + student[2] ;
        double average = sum / 3;
        System.out.printf("The average is : %.2f", average);
        sc.close();
    }
}
