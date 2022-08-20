public class Factorial {
    public static void main(String [] args){
        int n = 20;
        long factorial = 1;
        for(int i = n; i>=1; i--){
            factorial*=i;
        }
        System.out.printf("%d\n", factorial);
    }
}
