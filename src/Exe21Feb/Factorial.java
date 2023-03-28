package Exe21Feb;

import Utils.Utils;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println("introduceti un numar");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int sum  = 1;
//// 5! = 5 * 4 * 3 * 2 * 1
//        for (int i = 1; i<=x; i ++){
//            sum = sum * i;
//
//
//        }
//        System.out.println("Exe21Feb.Factorial este " + sum);
//    }

//        Exercitiul de mai sus este corect

//        Varianta 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");

        int x = scanner.nextInt();
        int factorialx = calculateFactorial(x);
        System.out.println("Factorial de " + x + " este " + factorialx);
    }


        public static int calculateFactorial ( int num){
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }

    }
