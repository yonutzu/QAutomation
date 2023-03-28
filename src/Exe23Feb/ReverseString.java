package Exe23Feb;

import Utils.Utils;

/*Reverse a string

For example: input: "cool" output: "looc"

For more help on how to solve this exercise, please refer to the tutorial provided as part of the hello world exercise.*/
public class ReverseString {
    public static void main(String[] args) {
ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(Utils.scanner().next()));


    }

    public String reverse(String string) {
        char[] elementChar = string.toCharArray();
        char[] reverseChar = new char[string.length()];
        int j = 0;

        for (int i = string.length() - 1; i >= 0; i--) {
reverseChar[j++] = elementChar[i];

        }
        return String.valueOf(reverseChar);
    }

}
