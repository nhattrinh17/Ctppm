import java.util.Scanner;

public class PrintNumberInWord {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1: 
                System.out.print("ONE");
                break;
            case 2: 
                System.out.print("TOW");
                break;
            case 3: 
                System.out.print("THREE");
                break;
            case 4: 
                System.out.print("FOUR");
                break;
            case 5: 
                System.out.print("FIVE");
                break;
            case 6: 
                System.out.print("SIX");
                break;
            case 7: 
                System.out.print("SEVEN");
                break;
            case 8: 
                System.out.print("EIGHT");
                break;
            case 9: 
                System.out.print("NICE");
                break;
            default:
                System.out.println("OTHER");
        }
        sc.close();
    }
}
