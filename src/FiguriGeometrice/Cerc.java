package FiguriGeometrice;

public class Cerc extends ObiectGrafic {

//  atribut
    double raza;

    public Cerc(double raza, double x, double y){
        super(x,y);
        this.raza= raza;
    }

//    2 metode

//    double aria() {
//        ;
//        return Math.PI * raza * raza;
//    }
//        double perimetru(){
//            return 2*Math.PI*raza;
//        }


    @Override
    public double aria() {
        return Math.PI *raza * raza;
    }

    @Override
    public double perimetru() {
        return 2 * Math.PI * raza;
    }
}