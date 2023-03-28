package Exe28Feb;

/*
Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
-‘a’: adaugare
-‘s’: scadere
-‘i’: inmultire
-‘p’: impartire
-‘m’: modul
Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

 */

import java.util.Scanner;

public class Asipm {
    public static void main(String[] args) {
caracter();
    }
    public static void caracter() {
        System.out.println("Introduceti un caracter: ");
        Scanner scanner = new Scanner(System.in);
        char caracter = scanner.next().charAt(0);
        System.out.println("Introduceti primul numar: ");
        int numarul1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int numarul2 = scanner.nextInt();
        switch (caracter) {
            case 'a': {
                System.out.println(numarul1 + numarul2);
                break;
            }
            case 's': {
                System.out.println(numarul1 - numarul2);
                break;
            }
            case 'i': {
                System.out.println(numarul1 * numarul2);
                break;
            }
            case 'p': {
                System.out.println(numarul1 / numarul2);
                break;
            }
            case 'm': {
                System.out.println(numarul1 % numarul2);
                break;
            }
            default:
                System.out.println("Eroare");
        }
    }
}
