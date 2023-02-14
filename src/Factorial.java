import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args ) {
        System.out.println("introduceti un numar");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum  = 1;
// 5! = 5 * 4 * 3 * 2 * 1
        for (int i = 1; i<=x; i ++){
            sum = sum * i;


        }
        System.out.println("Factorial este " + sum);
    }
}
