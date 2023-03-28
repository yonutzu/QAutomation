package Exe07Mar;

/*Media aritmetica a 3 numere este 14.
Primul este cu 7 mai mare decat al doilea si al treilea este de 3 ori mai mare decat al doilea.
(a+b+c)/3  = 14
 */
public class MediaAritmetica {

    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void mediaAritmetica() {
/*
(a+b+c)/3=14 => 14*3=42 (suma aritmetica)
a = b + 7
c=b * 3
((b+7) + b + (b*3))/3=14
((2b + 7) + (b*3)) = 42
5b+7 = 42
5 b= 35 =>
 b = 7;
 a = 14;
 c = 21
 */


//        media aritmetica >5 sa avem un mesaj
//        media aritmetica >10 sa avem un mesaj
//        media aritmetica >3 valoarea mediei aritmetic/1.5

        int mediaAritmentica = (a + b + c) / 3;
        if (mediaAritmentica > 5 && mediaAritmentica <10) {
            System.out.println("Media aritmetica este mai mare decat 5");
        } else if (mediaAritmentica > 10) {
            System.out.println("Media aritmetica este mai mare decat 10");
        } else if (mediaAritmentica < 3) {
            System.out.println("Valoarea este /1.5 " + (mediaAritmentica / 1.5));
        } else {
            System.out.println("Valori in afara conditiilor");
        }


    }
}
