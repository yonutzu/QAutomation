package Exercitii;

public class PrimeNumber {
    public static void main(String[] args) {
        int suma = 0;
        int count = 0;
        PrimeNumber primeNumber = new PrimeNumber();

       verificareNumarPrim(20);

    }

    public static void verificareNumarPrim(int numar) {

        for (int i = 2; i <= numar; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {

                    counter++;
                }
            }
            if(counter == 2){
                System.out.println(i);
            }
        }

    }
}


