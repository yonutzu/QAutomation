package Exe16Feb;

public class Run {
    public static void main(String[] args) {

    }

    public static double inmultire(double nr1, double nr2) {
        double rezultat = nr1 * nr2;
        return rezultat;
    }

    public static Double adaugare(double numar1, double nr2) {
        double rezultat = numar1 + nr2;
        return rezultat;
    }

    public static double scadere(Double numar1, Double numar2) {
        Double rezultat = adaugare(numar1, numar2) - numar2;
        return rezultat;
    }

    public static Double impartire(Double numar1, double numar2) {
        return numar1 / numar2;
    }

    public static int modul(int numar1, Integer numar2) {
        return numar1 & numar2;
    }

    public static double genereazaNumarRandom(double minim, double maxim) {
        return Math.random() * (maxim - minim) + minim;
    }


}
