package Exe28Feb;

import Utils.Utils;

import java.sql.SQLOutput;

/*Citit un numar de la tastatura si stocati valoarea lui intr-o variabila.
Generati un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila.
 Daca numarul introdus de la tastatura este mai mic decat numarul random generat,
  afisati mesajul “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random generat in textul afisat).*/
public class Random {
    public static void main(String[] args) {
        Random obj1 = new Random();
        obj1.compareNumbers(10);
//        obj1.compareNumbers1(10);

    }

    public void compareNumbers(int i) {
        System.out.println("Adauga numarul");
        int a = Utils.scanner().nextInt();

        int b = Utils.randomNumber(i);

        if (a < b) {
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul random este mai mare de cat " + a + " < " + b);
        } else {
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul citit de la tastatura este mai mare decat numarul random" + a + " > " + b);
        }
    }
        public void compareNumbers1(int i){
            System.out.println("Adauga numrul");
            int a = Utils.scanner().nextInt();
            if (a < Utils.scanner().nextInt()) {
                System.out.println("numarul radom este mai mre decat " + a + " < " + Utils.randomNumber(i));
            } else {
                System.out.println("Numarul citit de la tastatura este mai mare decat numarul random " + a + " > " + Utils.randomNumber(i));
            }
        }
    }

