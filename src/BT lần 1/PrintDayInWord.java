import java.util.Scanner;

public class PrintDayInWord {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1: 
                System.out.print("Monday");
                break;
            case 2: 
                System.out.print("Tuesday");
                break;
            case 3: 
                System.out.print("Wendnesday");
                break;
            case 4: 
                System.out.print("Thursday");
                break;
            case 5: 
                System.out.print("Friday");
                break;
            case 6: 
                System.out.print("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
        sc.close();
    }
}
