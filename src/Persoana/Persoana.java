package Persoana;

public class Persoana {

    public static String SPECIE =   "Homo Sapiens";
//    atribute
    String nume;
    int varsta;
    String adresa;


//    constructori

    Persoana(){
        nume ="Cornel";
        varsta= 35;
        adresa = "Bucuresti";
    }

    Persoana (String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

//    metode

    void plimbare(){
        System.out.println("Eu ma plimb prin parc");
    }

    void gateste(){
        System.out.println("Mie imi place sa gatesc");
    }

public static boolean respira(int  dataDecesului){
//        if(dataDecesului>0){
//            return false;
//        }else{
//            return true;
//        }
        return dataDecesului>0 ? false : true;
}

}
