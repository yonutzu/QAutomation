package Exercitii;

//Write a Java program to create a new array list, add some colors (string) and print out the collection

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
        ArrayList<String>colors=new ArrayList<>();
        colors.add("red");
        colors.add("purple");
        colors.add("black");

//        ori asa:

//        for(int i =0; i< colors.size(); i++) {
//            System.out.println(colors.get(i));
//
//        }


//        sau


        colors.get (1);
        System.out.println(colors.get(1));

//        nu are nicio treaba cu exercitiul:

//        String[] x=new String[3];
//        x[0]= "1";
//        x[1]="2";
//        x[2]="3";
//       System.out.println(x[0] );
//for (int i=0; i<3;i++){
//    System.out.println(x[i]);


    }

}
