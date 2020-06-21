import java.util.Scanner;
public class FibonacciSeries{
    public int getNthNumber(int n) //n is position
    {
        if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        else
            return getNthNumber(n-1) + getNthNumber(n-2);
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = fibonacciSeries.getNthNumber(input);
        System.out.println( " fibonacci series will give:"+ result+" on position:"+input);
    }
}