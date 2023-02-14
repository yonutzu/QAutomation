package Skillbrain.AnimalDeCompanie;

public class Main {
    public static void main(String[] args) {

        Labrador labrador = new Labrador();

        labrador.mananca();
        labrador.sunet();
        labrador.vaneaza();
//        System.out.println(labrador.rasa);      nu returneaza nimic pentru ca rasa este "private". Trebuie sa fie "public"
//        System.out.println(labrador.rasa());    nu returneaza nimic pentru ca rasa este "private". Trebuie sa fie "public"

        System.out.println(labrador.returneazaRasa());

        System.out.println(labrador.culoare);
        System.out.println(labrador.returneazaCuloare());

        System.out.println(labrador.numarPicioare);
        System.out.println(labrador.getNumarPicioare());

//        Caine caine = new Caine();
//
//        caine.mananca();
//
//        caine.sunet();
//        System.out.println(caine.inteligenta);
//
//        caine.reproducere();
//
//        caine.vaneaza();

        //    caine.inteligenta = "crescuta";   nu se poate pentru ca "inteligeligenta" este final
    }


}
