package Exe16Mar;

import java.util.LinkedList;

/*
How to create LinkedList program
 */
public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Caine");
        linkedList.add("Pisica");
        linkedList.add("Soricel");
        linkedList.add("Gaina");
        System.out.println(linkedList);

//      Stergerea unei variabile

        linkedList.remove("Pisica");
        System.out.println(linkedList);

//        Afisare index - indexul primei valori este 0

        System.out.println(linkedList.get(0));

//        dimensiunea caloectiei LinkedList

        System.out.println(linkedList.size());

    }
}
