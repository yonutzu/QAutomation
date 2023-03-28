package Jocuri;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // variabile de jucator

        int sanatate = 100;
        int atacDeteriorare = 50;
        int nrPotiuni = 3;
        int valoareRegenerarePotiune = 30;
        int sansaPotiune = 50; //procentaj


        // variabile inamic

        String[] inamici = {"Zombie", "Skeleton", "Warior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorara = 25;

        boolean running = true;
        System.out.println("Bine ai venit in Temnita");

        GAME:
        while (running) {
            System.out.println("--------------------------------");

            int sanatateInamic = rand.nextInt(maxSanatateInamic);
            String inamic = inamici[rand.nextInt(inamici.length)];

            System.out.println("\t# " + inamic + " a aparut! #");

            while (sanatateInamic > 0) {
                System.out.println("\tSanatatea ta este " + sanatate);

                System.out.println("\tSanatatea inamicului " + inamic + " este " + sanatateInamic);

                System.out.println("\t\nCe ai vrea sa faci?");
                System.out.println("\t1. Ataca");
                System.out.println("\t2. Bea potiune");
                System.out.println("\t3. Fugi");

                String input = in.nextLine();
                if (input.equals("1")) {
                    //cod pentru actiune de a ataca
                    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
                    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorara);

                    sanatateInamic = deteriorareProdusa;
                    sanatate = deteriorarePrimita;
                    System.out.println("\tL-ai lovit pe " + inamic + "cu " + deteriorareProdusa + "  deteriorare");
                    System.out.println("\tAi primit " + deteriorarePrimita + " deteriorare");

                    if (sanatate < 1) {
                        System.out.println("\tAi fost lovit prea tare. Esti prea slabit ca sa continui");
                        break;
                    }


                } else if (input.equals("2")) {
                    //cod pentru actiunea de a bea potiune
                    if (nrPotiuni > 0) {
                        sanatate += valoareRegenerarePotiune;
                        nrPotiuni--;
                        System.out.println("\tAi baut o potiune, te-ai videncat cu " + valoareRegenerarePotiune +
                                " \n\t Acum ai " + sanatate + " sanatate" +
                                "\n\t Ti-au ramas " + nrPotiuni + " potiuni");
                    } else {
                        System.out.println("\tNu mai ai potiuni! Invinge un inamic ca sa ai sansa ca sa mai castigi potiuni!\n   ");
                    }
                } else if (input.equals("3")) {
                    //cod pentru optiunea de a fugi
                    System.out.println("\tAi fugit de " + inamic);
                    continue GAME;
                } else {
                    //cod pentru optiune invalida
                    System.out.println("\tComanda invalida");
                }

            }
            if (sanatate < 1) {
                System.out.println("Te-au batut crunt in Temnita, esti prea slab");
                break;
            }
            System.out.println("--------------------------------");
            System.out.println("# " + inamic + " a fost invins! #");
            System.out.println("# Ai " + sanatate + " sanatate. #");

            if (rand.nextInt(100) < sansaPotiune) {
                nrPotiuni++;
                System.out.println(" # Ai castigat o potiune pe urma infrangerii lui " + inamic + "! #");
                System.out.println(" # Mai ai " + nrPotiuni + " potiuni #");
            }

            System.out.println("Ce ai vrea sa facem in continuare?");
            System.out.println("1. Continui lupsa");
            System.out.println("2. Termina jocul");

            String input = in.nextLine();

            while (!input.equals("1") && input.equals("2")) {
                System.out.println("Comanda invalida");
                input = in.nextLine();
            }
            switch (input) {
                case "1":{
                    System.out.println("Continui cu aventura");
                    break;
                }
                case "2":{
                    System.out.println("\nAi ales sa iesi din Temnita. Drum bun!");
                    break GAME;
                }
            }
        }
        System.out.println("##############################");
        System.out.println("# Multumim pentru joc! #");
        System.out.println("##############################");
    }
}

