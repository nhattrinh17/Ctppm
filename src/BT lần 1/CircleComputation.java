import java.lang.Math;
import java.util.Scanner;

public class CircleComputation {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Diameter is : %.2f\n", diameter);
        System.out.printf("Area is : %.2f\n", area);
        System.out.printf("Circumferece is : %.2f\n", circumference);
        sc.close();
    }
}
