import java.util.Scanner;

public class InputValidation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean validation = false;
        while(validation == false){
            int number = sc.nextInt();
            if( (number>=0 && number<=10) || (number>=90 && number<=100 ) ){
                System.out.printf("You have entered : %d", number);
                validation = true;
            }else{
                System.out.printf("Invalid input, try again... \n");
            }
        }
        sc.close();
    }
}
