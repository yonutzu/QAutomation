package Exe21Feb;

public class Exe2 {
    public static void main(String[] args) {
reverse(5,7);
reverse1(5,7);
    }
    public static void reverse (double a, double b){
        a = a+b;  //a= 13 +8 =21
        b= a -b;  //b = 21-8 =13
        a= a-b;   //a =21-13 =8

        System.out.println("a=" + a  + "   " + "b= " + "   " + b);
    }

    public static void reverse1(double a, double b){
        double temp = a;
        a = a+b;
        b=temp;
        System.out.println("a=" + a  + "   " + "b= " + "   " + b);

    }
}
