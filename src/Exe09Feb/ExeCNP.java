package Exe09Feb;

import Utils.Utils;

public class ExeCNP {
    public static void main(String[] args) {
        System.out.println("Introduceti un CNP pentru validare: ");
        long cenepe = Utils.scanner().nextLong();
        String temp = Long.toString(cenepe);
        ExeCNP cnp = new ExeCNP();
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
//    numbers[i] = Character.getNumericValue(temp.charAt(i));
            numbers[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        System.out.println(ExeCNP.verificareCNP(numbers));
    }

    public static boolean verificareCNP(int[] numarCNP) {
        int sum = 0;
        int cifraControl = 0;

        int[] constanta = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        for (int i = 0; i < numarCNP.length - 1; i++) {
            sum = sum + (numarCNP[i] * constanta[i]);
        }
        if (sum % 11 < 10) {
            cifraControl = sum % 11;
        } else if (sum % 11 == 10) {
            cifraControl = 1;
        }
        return cifraControl == numarCNP[numarCNP.length - 1] ? true : false;
    }
}