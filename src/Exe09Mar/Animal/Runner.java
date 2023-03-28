package Exe09Mar.Animal;

public class Runner {
    public static void main(String[] args) {
        Caine rex = new Caine();
        rex.setNume();
        System.out.println(rex.getNume());

        rex.setVarsta();
        System.out.println(rex.getVarsta());

        rex.aduBatul();
        rex.scoateSunet();

        Pisica lusie = new Pisica();
        lusie.setNume();
        System.out.println(lusie.getNume());
        lusie.setVarsta();
        System.out.println(lusie.getVarsta());

        lusie.scoateSunet();
        lusie.seJoaca();}


}
