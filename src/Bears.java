//Emma Hopkins -- teddy bear picnic
import java.util.Scanner;
public class Bears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        System.out.println(Bears(n));
    }

    public static boolean Bears(int n) {
        System.out.println(n);
        if (n == 42) {
            return true;
        }
        if (n < 42) {
            return false;
        }
        if ((n % 5 == 0) && Bears(n - 42)) {
            return true;
        }
        if ((n % 2 == 0) && Bears(n / 2)) {
            return true;
        }
        if ((n % 3 == 0 || n % 4 == 0) && Bears(n - ((n % 10) * ((n % 100) / 10)))) {
            return true;
        }
        return false;
    }
}
