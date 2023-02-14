import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Teme {
    public static void main(String[] args) {
        System.out.println("Imi place Java");
tema_2();
tema_3();
tema_4();
        int Elevi = 4;
        String animale = "pisicile";
        boolean fals = false;

myVariables (Elevi, animale, fals);
tema_6();
tema_7();
tema_8();

    }


    public static void tema_2() {

        for (int i = 0; i < 6; i++) {
            System.out.println("AStazi este Duminica!");
        }

    }
    public static void tema_3() {
        int Ana = 24;
        int David = Ana - 6;
        System.out.println("Varsta lui David este de " + David + " ani!");
    }

    public static void tema_4() {
        String nume;
        int varsta;
        char sex;
        double salariu;
        Scanner scanner = new Scanner(System.in );
        System.out.println("Numele meu este");
        nume = scanner.nextLine();
        System.out.println("am");
        varsta= scanner.nextInt();
        System.out.println("Sunt de sex");
        sex = scanner.next().charAt(0);
        System.out.println("cu salariul in valoare de");
        salariu = scanner.nextDouble();
        System.out.println("Numele meu este " + nume + "," + " am " + varsta + " de ani" + "." + "Sunt de sex " + sex + ", cu salariul in valoare de " + salariu);

    }
    public static void myVariables ( int Elevi, String animale, boolean fals){
        System.out.println("Numarul cursantilor este de: " + Elevi);
        System.out.println("Mie imi plac: " + animale );
        System.out.println("Numarul cursantilor este de: " + Elevi + "." +  " Mie imi plac " + animale + " " + fals);
    }

    public static void tema_6() {
        int nr1;
        int nr2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrieti primul numar");
        nr1 = scanner.nextInt();
        System.out.println("Scrieti al doilea numar");
        nr2 = scanner.nextInt();
        System.out.println("Primul numar este " + nr1 + ", iar"+" al doilea numar este " + nr2 );
    }
    public static void tema_7(){
        System.out.println("Numarul este");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Numarul introdus adumat cu 5 este: " + (a+5));
        System.out.println("Numarul introdus scazut cu 12.3 este: " + (a-12.3));
        System.out.println("Numarul introdus inmultit cu 3.2 este: " + (a* 3.2));
        System.out.println("Modulul cu 6 al numarului introdus este " + (a % 6));

    }
    public static void tema_8(){
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
      x = y - x;
      y = y - x;
       System.out.println(x);
       System.out.println(y);
    }



}


