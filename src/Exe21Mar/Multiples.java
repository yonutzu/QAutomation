package Exe21Mar;

import Utils.Utils;

/*
Java program to display all the multiples of 3 within the range 10 to 50
 */
public class Multiples {
    public static void main(String[] args) {
     Multiples obj = new Multiples();
     obj.display();

    }
    public void display (){
        for(int i =10; i <=50;i++){
            if(i%3==0){
                System.out.println("Numar divizibil cu 3:  " + i);
            }
        }
    }

}
