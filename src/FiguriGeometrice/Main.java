package FiguriGeometrice;

public class Main {
    public static void main(String[] args) {
        Cerc cerc= new Cerc(11.5, 2.9, -7.1);
        System.out.println(cerc.x);
        System.out.println(cerc.y);
        System.out.println(cerc.raza);
        System.out.println(cerc.aria());
        System.out.println(cerc.perimetru());

        ObiectGrafic dreptunghi = new Dreptunghi(2.1,3.2,10.0,2.5);
        System.out.println(dreptunghi.x);
        System.out.println(dreptunghi.y);
        System.out.println("latime = " + (((Dreptunghi)dreptunghi).latime));
        System.out.println("lungime = " + (((Dreptunghi)dreptunghi).lungime));
        System.out.println("aria = " + (dreptunghi.aria()));
        System.out.println("perimentru= " + (dreptunghi.perimetru()));

    }
}
