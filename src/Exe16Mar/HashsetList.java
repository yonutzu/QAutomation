package Exe16Mar;
/*
How to create Hashset program
 */
import java.util.HashSet;

public class HashsetList {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        set.add("Caine");
        set.add("Pisica");
        set.add("Maimuta");
        set.add("Dinozaur");
        set.add("Cal");

        System.out.println(set);

        set.remove("Dinozaur");
        System.out.println(set);
    }

}
