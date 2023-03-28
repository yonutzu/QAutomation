package Exe16Mar;

import Utils.Utils;
import jdk.jshell.execution.Util;

/*
How to convert string to float
 */
public class StrToFloat {
    public static void main(String[] args) {
        System.out.println("Introduceti o valoare");
        StrToFloat obj = new StrToFloat();
        System.out.println(obj.convert(Utils.scanner().next()));
    }
    public float convert (String value){
        float number = Float.parseFloat(value);
        return number;
    }
}
