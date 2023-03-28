package Exe28Feb;
/*
Definiti un array de char-uri.
Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir
 */

public class MatrixArray {
    public static void main(String[] args) {
        char[] array = {'H', 'E', 'L', 'L', 'O', '/', 'W', 'O', 'R', 'L', 'D'};
        MatrixArray obj1 = new MatrixArray();
        obj1.metoda1(array);
//        obj1.metoda2(array);

    }


    public void metoda1(char[] args) {
        for (int i = 0; i < args.length; i += 2) {
            if (i % 2 == 0) {
                System.out.print(args[i]);
            }
        }

    }

    public void metoda2(char[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) {
                System.out.print(args[i]);
            }
        }

    }

}
