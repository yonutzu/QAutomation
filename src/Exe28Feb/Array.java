package Exe28Feb;

public class Array {
    public static void main(String[] args) {
arrayChar();
    }
    public static void arrayChar(){
        char[][] array = {{'a', 'b','c'},{'d','e', 'f','g','h'}};
        for(int i = 0; i < array.length; i++);
        System.out.println(array[0][0]);
        System.out.println(array[1][4]);
    }
}
