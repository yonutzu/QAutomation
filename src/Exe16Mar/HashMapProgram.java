package Exe16Mar;
/*
 How to create HashMap using map interface
program
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"caine");
        map.put(2,"pisica");
        map.put(3,"urangutan");
        map.put(4,"dinozaur");
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.get(2));

        System.out.println(map.remove(1));
        System.out.println(map);
    }
}
