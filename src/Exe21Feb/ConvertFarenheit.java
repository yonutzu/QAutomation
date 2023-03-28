package Exe21Feb;

import java.util.Scanner;

public class ConvertFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura:  ");

//        gradetastatura(input.nextLine());   //randurile comentate reprezinta o alta varianta
double value = scanner.nextDouble();
        System.out.print(gradetastatura(value));

    }
    public static double gradetastatura(double Fahr) {
        //   formula : (F-32) *5/9 =    C;
        return ((Fahr-32)*5/9);
//        int newVal = (Integer.parseInt(Fahr) - 32) *5/9;
//        System.out.println( newVal + " GradeC");



    }
}

