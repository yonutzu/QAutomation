package Exe09Mar.Animal;

public class Caine extends Animal {
    private String nume;
    private int varsta;

    public String getNume (){
return nume;
    }
    public void setNume (){
this.nume = Varsta.randomName();
    }

    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(){
        this.varsta = Varsta.randomVarsta();
    }
    public void aduBatul(){
        System.out.println("Cainele aduce batul");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Latra");
    }
}
