package Exercitii;

//Write a Java program to insert an element into the array list at the first position

import java.util.ArrayList;

public class List {

    public static void main(String[]args){
        ArrayList<String> nume = new ArrayList<>();
        nume.add("Ionut");
        nume.add("Tibi");
        nume.add("Mihai");
        nume.add("Alex");
        nume.add("Vasile");
        nume.add("Dragos");
        nume.add("Marian");
        nume.set(0,"numeTibi");
        for (int i =0; i<=nume.size(); i++){
            if (i % 2 == 0) {
                System.out.println(nume.get(i));   // Afiseara elementele pare
            }

        }

    }
}
