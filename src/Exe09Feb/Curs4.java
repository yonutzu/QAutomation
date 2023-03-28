package Exe09Feb;

public class Curs4 {
    public static int x=5;

    public static void main(String[] args) {
        Curs4 obj1 = new Curs4();
        System.out.println(obj1.x);
        System.out.println(obj1.returns(7));

        Curs4 obj2 = new Curs4();
        System.out.println(obj2.x);
ceva();

    }
    public int returns (int x){
        System.out.println(this.metoda(x,x));
        return  this.x = x;

    }

    public int metoda (int a, int b){
        return a+b;
    }

    public static void  ceva (){
        System.out.println("Aceasta este o metoda statica");
    }
}
