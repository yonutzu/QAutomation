package Exe02Mar;

import Utils.Utils;

/*
Determine if a triangle is equilateral, isosceles, or scalene.

An equilateral triangle has all three sides the same length.

An isosceles triangle has at least two sides the same length. (It is sometimes specified as having exactly two sides the same length, but for the purposes of this exercise we'll say at least two.)

A scalene triangle has all sides of different lengths.

Note
For a shape to be a triangle at all, all sides have to be of length > 0, and the sum of the lengths of any two sides must be greater than or equal to the length of the third side. See Triangle Inequality.

Dig Deeper
The case where the sum of the lengths of two sides equals that of the third is known as a degenerate triangle - it has zero area and looks like a single line. Feel free to add your own code/tests to check for degenerate triangles.
 */
public class Triunghiuri {
    public static void main(String[] args) {
        Triunghiuri triunghiuri = new Triunghiuri();
        triunghiuri.detTriangle((Utils.scanner().nextInt()), (Utils.scanner().nextInt()), (Utils.scanner().nextInt()));
    }

    public void detTriangle(int a, int b, int c) {
        if (a != 0 && b != 0 && c != 0) {
            if ((a + b >= c) && (a + c >= b) && (b + c >= a)) {
                if (a == b && b == c && a == c) {
                    System.out.println("Triangle is equilateral ");
                } else if (a == b || b == c || a == c) {
                    System.out.println("Triangle is isoscel ");
                } else if (!(a == b) && !(b == c) && !(a == c)) {
                    System.out.println("Triangle is scalene ");
                }
            }else{
                System.out.println("Suma a doua laturi este mai mare sau egala ");
            }
        }else{
            System.out.println("Adauga valori mai mari decat 0");
        }
    }
}
