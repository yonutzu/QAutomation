package Exe16Mar;

import java.util.ArrayList;

public class StrToLong {
    public static void main(String[] args) {
        System.out.println("introduceti o valoare");
        StrToLong obj = new StrToLong();
        System.out.println(obj.convert(Utils.Utils.scanner().next()));
//        System.out.println(obj.longlist(Utils.Utils.scanner().next()));
    }
    public long convert (String value){
        long number = Long.parseLong(value);
        return number;
    }
    public Long longlist(String value){
        ArrayList al = new ArrayList();
        al.add(convert(value));
        return (Long) al.get(0);
    }


}
