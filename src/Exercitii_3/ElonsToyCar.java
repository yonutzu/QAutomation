package Exercitii_3;

public class ElonsToyCar {
    private int distance;
    private  int battery;

    public ElonsToyCar(int distance1, int battery1){
        this.distance = distance1;
        this.battery = battery1;
    }
        public static ElonsToyCar buy(){
        return new ElonsToyCar(0,100);
        }
            public String distanceDisplay(){
                return "Driven " + distance + " meters";
    }
    public String batteryDisplay(){
        return "Battery at " + battery + " % ";
    }
                public void drive (){
                    if(battery !=0){
                        distance = distance + 20;
                        battery = battery-1;
                        }
                }
                public static void main(String []args){
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();

            System.out.println(car.batteryDisplay());
            System.out.println(car.distanceDisplay());

                    for (int i= 0; i < 101; i++){
                        car.drive();

                    }
                    System.out.println(car.batteryDisplay());
                    System.out.println("Battery empty");
                }
}
