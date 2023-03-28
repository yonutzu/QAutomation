package Exe21Feb;

import Utils.Utils;

import java.util.Scanner;

public class OddEven { // Par sau Impar
    public static void main(String[] args) {
        System.out.println("Introduceti un numar de la tastatura:");
oddeven(Utils.scanner().nextInt());
    }

    public static void oddeven(int a) {


        if (a % 2 == 0 ) {
            System.out.println("Numerul este par");
        }
        else{
            System.out.println("Numarul este impar");
        }
    }


}
