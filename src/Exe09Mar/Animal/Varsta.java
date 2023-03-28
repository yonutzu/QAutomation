package Exe09Mar.Animal;

import java.util.Random;

public class Varsta {

    public static int randomVarsta() {
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }

    public static String randomName() {
        Random random = new Random();
        String nume = " ";
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < 5; i++) {
            nume = nume + letters[random.nextInt(letters.length)];
        }
        return nume;
    }
}
