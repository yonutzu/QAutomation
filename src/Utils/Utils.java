package Utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static int randomNumber(int bound) {
        java.util.Random random = new Random();
        return random.nextInt(bound);
    }
}
