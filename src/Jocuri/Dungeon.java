//package Jocuri;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Dungeon {
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random rand = new Random();
//
//        // variabile de jucator
//
//        int sanatate =100;
//        int  atacDeteriorare = 10;
//        int potiuni = 3;
//        int valoareRegenerarePotiune = 30;
//        int sansaPotiune = 50; //procentaj
//
//
//        // variabile inamic
//
//        String [] inamici = {"Zombie", "Skeleton", "Warior", "Assasin"};
//        int maxSanatateInamic = 75;
//        int inamicAtacDeteriorara = 25;
//
//        boolean running =true;
//        System.out.println("Bine ai venit in Temnita");
//
//        GAME:
//while (running) {
//    System.out.println("--------------------------------");
//
//    int sanatateInamic = rand.nextInt(maxSanatateInamic);
//    String inamic = inamici[rand.nextInt(inamici.length)];
//
//    System.out.println("\t# " + inamic + " a aparut! #");
//
//    while (sanatateInamic > 0){
//        System.out.println("\tSanatatea ta este " + sanatate);
//
//        System.out.println("\tSanatatea inamicului " +inamic + " este " + sanatateInamic);
//
//        System.out.println("\t\nCe ai vrea sa faci?");
//        System.out.println("\t1. Ataca");
//        System.out.println("\t2. Bea potiune");
//        System.out.println("\t3. Fugi");
//
//        String input = in.nextLine();
//if (input.equals("1")){
//    //cod pentru actiune de a ataca
//    int deteriorareProdusa = rand.nextInt(atacDeteriorare);
//    int deteriorarePrimita = rand.nextInt(inamicAtacDeteriorara);
//
//sanatateInamic = deteriorareProdusa;
//sanatate = deteriorarePrimita;
//    System.out.println("\tL-ai lovit pe " + inamic + "cu " + deteriorareProdusa + "deteriorare");
//    System.out.println("\tAi primit " + deteriorarePrimita + " deteriorare");
//
//if (sanatate <1){
//    System.out.println("\tAi fost lovit prea tare. Esti prea slabit ca sa continui");
//    break;
//}
//
//
//}else if (input.equals("2")){
//    //cod pentru actiunea de a bea potiune
//} else if (input.equals("3")) {
//    //cod pentru optiunea de a fugi
//}else{
//    //cod pentru optiune invalida
//}
//
//    }
//
//
//}
//    }
//}
//
