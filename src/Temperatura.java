import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gradetastatura(input.nextLine());

    }
    public static void gradetastatura(String val) {
        //   formula : (F-32) *5/9 =    C;
        int newVal = (Integer.parseInt(val) - 32) *5/9;
        System.out.println( newVal + " GradeC");



    }
}

