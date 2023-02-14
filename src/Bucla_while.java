import java.util.ArrayList;

public class Bucla_while {
    public static void main(String[] args) {
     /*
        while - conditie {
        //corp de bucla
        update.counter
        }
      */
//

//        double[] numere = {21.4, 43.6, 5, -15.4};
//
//        int i = 0;
//        while (i< numere.length){
//            System.out.println("Indexul este " + i +  ", valoarea este " + numere[i]);
//            i++;
//        }
//
//        ArrayList<Double> lista = new ArrayList<>();
//        lista.add(23.4);
//        lista.add(12.3);
//        lista.add(9d);

//        int j= lista.size() - 1;
//        while (j< lista.size()){
//            System.out.println("Indexul este " + j + ", valoarea este " + lista.get(j));
//            j--;
//        }


        /*
        do () {
        //corp de bucla
        update.counter;
        } while (conditie)
         */

        double[] numere = {21.4, 43.6, 5, -15.4};

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(23);
        lista.add(-12);
        lista.add(9);

        double sumaArray = 0;
        int i = 0;
        do {
            sumaArray = sumaArray + numere[i];
            i++;
        } while (i < numere.length);
        System.out.println("Suma este egala cu " + sumaArray);

        Integer sumaArrayList = 0;
        int j = 0;
        do {
            sumaArrayList = sumaArrayList + lista.get(j);
            j++;
        }while (j<lista.size());
        System.out.println("Suma elementelor din ArrayList este " + sumaArrayList);


    }
}
