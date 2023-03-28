package Exe28Feb;

import Utils.Utils;

public class Asipm2 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        double number1 = Utils.scanner().nextDouble();
        System.out.println("Enter second number");
        double number2 = Utils.scanner().nextDouble();
        System.out.println("Enter character");
        String calc = Utils.scanner().next();

Asipm2 obj = new Asipm2();
        System.out.println(obj.calculator(number1, number2, calc));
    }

    public double calculator(double a, double b, String rez) {
        if (a != 0 && b != 0 && a + b != 70) {
            switch (rez.charAt(0)) {
                case 'a':
                    return a + b;
                case 's':
                    return a - b;
                case 'i':
                    return a * b;
                case 'p':
                    return a / b;
                case 'm':
                    return a % b;
                default:
                    throw new IllegalArgumentException("Valoarea aritmetica nu este corecta");
            }
        } else {
            System.out.println("Executa calculator: ");
            throw new IllegalArgumentException("Nu se indeplinesc primele conditii");
        }
    }
}
