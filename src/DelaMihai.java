import java.util.Scanner;

public class DelaMihai {
    /*   */
//    https://www.w3resource.com/java-exercises/basic/index.php

    /*  Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
Expected Output :
Hello
Pintilie Ionut */

    public static void main (String [] args) {
        System.out.println("Hello");
        System.out.println("Pintilie " + "Ionut");


    /*Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110 */
        System.out.println(74 + 36);

        /*Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16 */

        System.out.println(50/3);

        /* Write a Java program to print the result of the following operations. Go to the editor
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/
        System.out.println(-5 + 8 * 6);
        System.out.println(((55+9) % 9));
        System.out.println(20 + -3*5 / 8);
        System.out.println( 5 + 15 / 3 * 2 - 8 % 3);

/*Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */
        System.out.println("Introduceti primul numar :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


    }
}


