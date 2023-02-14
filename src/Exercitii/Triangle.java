package Exercitii;

public class Triangle {
    /*  Determine if a triangle is equilateral, isosceles, or scalene.

    An equilateral triangle has all three sides the same length.

    An isosceles triangle has at least two sides the same length. (It is sometimes specified as having exactly two sides the same length, but for the purposes of this exercise we'll say at least two.)

    A scalene triangle has all sides of different lengths.

    Note
    For a shape to be a triangle at all, all sides have to be of length > 0, and the sum of the lengths of any two sides must be greater than or equal to the length of the third side.*/

    public static void main(String []args) {
        Triangle triangle = new Triangle();
        if (triangle.verificarelaturi(2, 3, 4)) {
            if(triangle.verificareIsoscel(2,4,4)){
                System.out.println("Este Isoscel " + triangle.verificareIsoscel(2,4,4));
            } else if (triangle.verificareEchilateral(3,3,3)) {
                System.out.println("Este echilateral "+ triangle.verificareEchilateral(3,3,3));
            } else if (triangle.verificareScalene(5,5,6)) {
                System.out.println("Este Scalar "+triangle.verificareScalene(5,5,6));
            }
        }

    }
public boolean verificarelaturi(double side1, double side2, double side3) {
    if (side1 > 0 && side2 > 0 && side3 > 0) {
        if ((side1 + side2) >= side3 && (side1 + side3) >= side2 && (side2 + side3) >= side1) {
        }
        return true;

    } else {
        return true;
    }
}
public boolean verificareIsoscel(double side1, double side2, double side3){
        boolean verificareIsoscel  = false;
        if((side1==side2)||(side1==side3)||(side3==side2)){
            verificareIsoscel = true;
}
       return verificareIsoscel;

}
public boolean verificareEchilateral(double side1, double side2, double side3){
    boolean verificareEchilateral= false;
    if((side1==side2)&&(side1==side3)&&(side3==side2))  {
        verificareEchilateral = true;
    }
    return verificareEchilateral;
    }
    public boolean verificareScalene(double side1, double side2, double side3){
        boolean verificareScalene  = false;
        if(side1==side2 && side1==side3){
            verificareScalene = true;
        }
        return verificareScalene;
    }
}


