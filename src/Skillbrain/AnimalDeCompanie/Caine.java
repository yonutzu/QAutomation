package Skillbrain.AnimalDeCompanie;

import Skillbrain.Animal;
import Skillbrain.Mamifer;

public class Caine implements Mamifer, AnimalDeComapanie {

//private String variabilaPrivata = "Eu sunt Privata";

    int numarPicioare = 4;

    public int getNumarPicioare() {
        return numarPicioare;
    }

    @Override
    public void mananca() {
        System.out.println("Eu sunt un caine si imi place sa mamanc oase");
    }

    @Override
    public void sunet() {
        System.out.println("HAM HAM");
    }

    @Override
    public void reproducere() {
        System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
    }

    @Override
    public void vaneaza() {
        System.out.println("Eu sunt un caine si nu  pot vana");
    }

    private void alearga (){
        System.out.println("Eu sunt un animal si alerg");
//        System.out.println(variabilaPrivata);
    }
}



