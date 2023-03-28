package Exe07Feb;

//
//Letter                           Value
//        A, E, I, O, U, L, N, R, S, T       1
//        D, G                               2
//        B, C, M, P                         3
//        F, H, V, W, Y                      4
//        K                                  5
//        J, X                               8
//        Q, Z                               10
//Examples
//        "cabbage" should be scored as worth 14 points:

import Utils.Utils;

public class Scrabble {
    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble();
        scrabble.calcul(Utils.scanner().nextLine() );
    }

    public int switcher(String elements) {
        switch (elements) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "L":
            case "N":
            case "R":
            case "S":
            case "T":
                return 1;

            case "D":
            case "G":
                return 2;

            case "B":
            case "C":
            case "M":
            case "P":
                return 3;

            case "F":
            case "H":
            case "Y":
            case "V":
            case "W":
                return 4;

            case "K":
                return 5;

            case "J":
            case "X":
                return 8;

            case "Q":
            case "Z":
                return 10;
            default:
                return -1;

        }
    }
    public void calcul (String word){
            int suma=0;
            for (int i= 0; i<word.length(); i++){
                suma = suma + switcher(String.valueOf(word.charAt(i)).toUpperCase());
            }
        System.out.println(suma);
    }

}
