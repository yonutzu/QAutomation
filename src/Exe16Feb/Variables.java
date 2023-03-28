package Exe16Feb;

public class Variables {
    public static void main(String[] args) {
        System.out.println(divide(120.5,11.5));

        System.out.println(Run.adaugare(2.0,3.0) + "--" +  Run.inmultire(2.0,3.0) + "--" + Run.impartire(3.0,4.0)
                + "--" + Run.scadere(4.0,5.0) + "--" +Run.modul(5,6) + "--" +Run.genereazaNumarRandom(8,5));
    }
    public static double divide (double a, double b){    // se putea face cu int
        double c = (double) (a/b) ;
return c;

    }

}
