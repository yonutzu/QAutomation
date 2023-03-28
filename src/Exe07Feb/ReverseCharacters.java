package Exe07Feb;

import Utils.Utils;

public class ReverseCharacters {
    public static void main(String[] args) {

        System.out.println("Introdu un cuvant: ");
        StringBuilder x = new StringBuilder();
//        Scanner scanner = new Scanner(System.in);

        char[] a = Utils.scanner().nextLine().toCharArray();
        System.out.println("Cuvantul introdus este: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
            x.append(a[i]);
        }
        System.out.println(x);
        ReverseCharacters main = new ReverseCharacters();
        main.metoda(Utils.scanner().nextLine());
    }

    public void metoda(String c) {
        int letters = 0;
        int numbers = 0;
        String c2= c.replaceAll(" ", "");
        for (int i = 0; i < c.length(); i++) {
            if (Character.isLetter(c2.charAt(i))) {
                letters++;
            } else if (Character.isDigit(c2.charAt(i))) {
                numbers++;
            }


        }
        System.out.println("Numar litere = " + letters);
        System.out.println("Numar cifre = " + numbers);

    }
}
