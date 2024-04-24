//Emma Hopkins -- recursive section numbers
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input prefix:");
        String prefix = input.next();
        System.out.print("Input levels:");
        int level = input.nextInt();
        Recursion(prefix, level);
    }

    public static void Recursion(String prefix, int level){
        if (level != 1) {
            Recursion(prefix + "1.", level - 1);
        }
        else {
            System.out.println(prefix + "1");
        }
        if (level != 1){
            Recursion(prefix + "2.", level - 1);
        }
        else {
            System.out.println(prefix + "2");
        }
        if (level != 1){
            Recursion(prefix + "3.", level - 1);
        }
        else {
            System.out.println(prefix + "3");
        }
    }
}

