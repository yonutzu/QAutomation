package Skillbrain.AnimalDeCompanie;

public class Labrador extends Caine{

    public String culoare = "maro";
    private String rasa = "Labrador";

    private String rasa(){
        return rasa;
    }

    String returneazaCuloare(){
        return culoare;
    }

    public  String returneazaRasa(){
        return rasa;
    }

//    public String returneazaAlergare(){
//        return alearga();
//       System.out.println(variabilaPrivata);

//    }
@Override
    public void mananca(){
    System.out.println("Eu sunt un Labrador si imi place sa mamanc Pedigree ");
}

}
