package FiguriGeometrice;

public class Dreptunghi extends ObiectGrafic{
    public Dreptunghi(double x, double y, double lungime, double latime) {
        super(x, y);
        this.lungime = lungime;
        this.latime = latime;
    }

    //    double aria() {
//        return 0;
//
//    }
//
//
//    double perimetru() {
//        return 0;
//
//    }

double lungime;
double latime;


    @Override
    public double aria() {
        return lungime *lungime;
    }

    @Override
    public double perimetru() {
        return 2*(lungime+latime);
    }
}
