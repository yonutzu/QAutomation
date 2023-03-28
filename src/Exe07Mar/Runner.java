package Exe07Mar;

public class Runner {
    public static void main(String[] args) {
        MediaAritmetica valoare = new MediaAritmetica();
        valoare.setA(12);
        valoare.setB(12);
        valoare.setC(12);
        valoare.mediaAritmetica();

        System.out.println(valoare.getA());
    }
}
