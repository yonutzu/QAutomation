package Skillbrain;

import java.util.ArrayList;
import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
        introducereNumar();
        caracter();
        array();
       arrayChar();
        arrayDouble();
        arrayElemente();
        arrayInteger();
        arrayList();
    }

    //    B1
    public static void introducereNumar() {
        System.out.println("Introduceti un mumar: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double minim = 1;
        double maxim = 100;
        double numarRandom = Math.random() * (maxim - minim) + maxim;
        if (a < numarRandom) {
            System.out.println("Numarul este mai mic decat " + numarRandom);
        }

    }

    //        B2
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

    //    B3
    public static void array() {
        int[][] array = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        System.out.println("Primul element din prima dimensiune este: " + array[0][0]);
        System.out.println("Ultimul element din prima dimensiune este: " + array[0][2]);
        System.out.println("Primul element din a doua diminsiune este: " + array[1][0]);
        System.out.println("ultimul element din a doua dimensiune este: " + array[1][4]);
    }

//       B4
//        Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.
    public static void arrayChar() {

        char[][] array = {{'a', 'b', 'c'}, {'d', 'e', 'f', 'g', 'h'}, {'d', 't', 'm'}};
        for (int i = 0; i < array.length; i++) ;
        System.out.println(array[0][1]);
        System.out.println(array[1][1]);
        System.out.println(array[2][1]);
    }

//    B5
//    Definiti un array de double, cu valori zecimale.
//      Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5, afisati-l pe ecran.
//       Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”
    public static void arrayDouble() {

        double[] array = {1.2, 3.2, 4.5, 5.0, 5.5};
        for (int i = 0; i < array.length ; i++){
            if (array[i]==4.5) {
                System.out.println(array[i]);
            }
            if ( array[i]>5.0) {
                System.out.println("Element peste 5");

            }
        }

    }

//    B6

//        Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
//        Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
//        Altfel, sa se afiseze mesajul “Index valid” pe ecran.
    public static void arrayElemente(){


        char [] a = {'a','b', 'c', 'd', 'e', 'f','g', 'h', 'i'};
        for (int i=0; i<a.length; i++){
            if(i == 2){
                continue;
            }
            if (i==7){
                break;
            }
            if (i!= 2 && i!=7){
                System.out.println("Index valid");
            }
        }
    }


//      B7

//        Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
    public static void  arrayInteger(){

        int [] elemente = {0,1,2,3,4};
        int sum = 0;
        for (int i=0; i<elemente.length; i++){
            sum = sum + elemente[i];
        }
        System.out.println(sum);
    }

//    B8

//    Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
    public static void arrayList(){
        int [] elemente = {};
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(1);
        if (elemente.length == 0){
            System.out.println("Nu afiseaza nimic");
        }else{
            System.out.println("Array-ul nu este gol");
        }
        if (list.size() == 0){
            System.out.println("Lista este goala");
        }else{
            System.out.println("Lista nu este goala");
        }


    }

}



