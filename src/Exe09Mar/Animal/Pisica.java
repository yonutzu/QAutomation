package Exe09Mar.Animal;

public class Pisica extends Animal {
    private String nume;
    private int varsta;
    public String getNume (){
        return  nume;
    }
    public void setNume (){
        this.nume = Varsta.randomName();
    }
    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(){
        this.varsta= Varsta.randomVarsta();
    }

    public void seJoaca(){
        System.out.println("Rostogoleste ghemul");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Miauna");
    }
}
