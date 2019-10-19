import java.util.Scanner;

public class Watemelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if(b%2 == 0 && b != 2)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
