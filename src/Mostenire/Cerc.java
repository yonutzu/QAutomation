package Mostenire;

public class Cerc extends Perimetru implements Shapes {


@Override
    public double area(double raza){
    double aria = Math.PI * raza * raza;
    return aria;
}

}
