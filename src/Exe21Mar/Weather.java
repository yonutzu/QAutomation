package Exe21Mar;
/*
1) Java program to check whether the given integer is a multiple of 5
1) b Java program to check whether the given integer is a multiple of both 5 and 7
 */
public class Weather {
    public static void main(String[] args) {
        System.out.println("Introduceti un obiect");
        Weather obj = new Weather();
        obj.check(Utils.Utils.scanner().nextInt());
    }
    public void check(int x){
        if(x%5 ==0 && x%7 ==0){
            System.out.println("Numarul este multiplu de 5 si de 7");
        }else{
            System.out.println("Numarul nu este multiplu nici cu 5 nici cu 7");
        }
    }
}
