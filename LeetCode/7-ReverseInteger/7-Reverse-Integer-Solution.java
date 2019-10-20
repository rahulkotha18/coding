import java.util.ArrayList;

/**
 * Created with love by DataSecs on 08.05.18
 */
public class Problem7ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(1537657699));
        System.out.println(reverse(351));
        System.out.println(reverse(1463847412));
        System.out.println(reverse(-1463847412));
        System.out.println(reverse(01));
        System.out.println(reverse(0000001));
        System.out.println(reverse(100000));
        System.out.println(reverse(-2147483648));
        System.out.println(reverse(1999999992));
        System.out.println(reverse(1563847412));
    }

    private static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }
}