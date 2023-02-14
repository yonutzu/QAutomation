package Exercitii;

/*Determine if a number is perfect, abundant, or deficient based on Nicomachus' (60 - 120 CE) classification scheme for positive integers.

        The Greek mathematician Nicomachus devised a classification scheme for positive integers, identifying each as belonging uniquely to the categories of perfect, abundant, or deficient based on their aliquot sum. The aliquot sum is defined as the sum of the factors of a number not including the number itself. For example, the aliquot sum of 15 is (1 + 3 + 5) = 9

        Perfect: aliquot sum = number
        6 is a perfect number because (1 + 2 + 3) = 6
        28 is a perfect number because (1 + 2 + 4 + 7 + 14) = 28
        Abundant: aliquot sum > number
        12 is an abundant number because (1 + 2 + 3 + 4 + 6) = 16
        24 is an abundant number because (1 + 2 + 3 + 4 + 6 + 8 + 12) = 36
        Deficient: aliquot sum < number
8 is a deficient number because (1 + 2 + 4) = 7
        Prime numbers are deficient
        Implement a way to determine whether a given number is perfect. Depending on your language track, you may also need to implement a way to determine whether a given number is abundant or deficient.

*/

import Utils.Utils;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Adaugati un numar:  ");
        int x = Utils.scanner().nextInt();

        PerfectNumbers perfectNumbers= new PerfectNumbers();
        perfectNumbers.verificareNumar(x);
    }

    public void verificareNumar(int numar) {
        int sum = 0;
        for (int i = 1; i <= numar - 1; i++) {
            if ( numar %i  == 0) {
                sum = sum + i;
            }
        }
        if (sum == numar) {
            System.out.println("Numarul este perfect");
        } else if (sum > numar) {
            System.out.println("Numarul este Abundant");
        } else {
            System.out.println("Numarul este Deficient");
        }

    }
}
