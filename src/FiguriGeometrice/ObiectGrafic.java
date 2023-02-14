package FiguriGeometrice;

public abstract class ObiectGrafic {

    public double x,y;

    public ObiectGrafic(double x, double y){
        super();


        this.x=x;
        this.y=y;
    }

    public abstract double aria();


    public abstract double perimetru();





}
