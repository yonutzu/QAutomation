package Exe16Mar;

import java.util.ArrayList;
import java.util.List;

/*
How to ArrayList using list interface program
 */
public class ArrayListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("caine");
        list.add("pisica");
        list.add("soricel");
        list.add("gaina");
        System.out.println(list);

//        stergere variabila

        list.remove("pisica");
        System.out.println(list);

//      Lungime arraylist
        System.out.println(list.size());

        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));

        }
    }
}
