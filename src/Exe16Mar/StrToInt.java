package Exe16Mar;

import jdk.jshell.execution.Util;

/*
How to convert string to integer in java
program
 */
public class StrToInt {
    public static void main(String[] args) {
        System.out.println("Introduceti de la tastatura");
        StrToInt obj = new StrToInt();

        System.out.println(obj.convert(Utils.Utils.scanner().nextLine()));
        System.out.println("Introduceti de la tastatura");
        System.out.println(obj.convert2(Utils.Utils.scanner().nextInt()));
    }
    public int convert (String value){
        int number = Integer.parseInt(value);
        return number;
    }
    public String convert2(int value){
     switch(value){
         case 1:
             return "One";
         case 2:
             return "two";
         case 3:
             return "three";
         case 4:
             return "four";
         case 5:
             return "five";
         case 6:
             return "six";
         case 7:
             return "seven";
         case  8:
             return "eight";
         case 9:
             return "nine";
         default:
                 return "zero";

     }
    }

}
