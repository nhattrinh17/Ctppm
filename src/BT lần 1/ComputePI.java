import java.util.Scanner;

public class ComputePI {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.00;
        int sign = 1;
        for(int i = 1; i<= n; i++){
            if(i%2 != 0){
                sum += sign*(1.0/i);
                sign *= -1;
            }
        }
        double pi = 4*sum;
        System.out.printf("Harmonic n : %.9f", pi);
        sc.close();
    }
}
