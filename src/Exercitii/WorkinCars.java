package Exercitii;

/*Instructions
In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).

At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded. The following table shows how speed influences the success rate:

1 to 4: 100% success rate.
5 to 8: 90% success rate.
9: 80% success rate.
10: 77% success rate.
1. Calculate the production rate per hour
Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour, taking into account its current assembly line's speed :
2. Calculate the number of working items produced per minute
Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute:*/

class Rate {
    public int prodRateHour(int speed) {
        int carsPerHour = 0;
        switch (speed) {
            case 1:
            case 2:
            case 3:
            case 4:
                carsPerHour = speed * 221;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                carsPerHour = ((speed * 221) * 90) / 100;
//                    carsPerHour = carsPerHour/100;
                break;
            case 9:

                carsPerHour = ((speed * 221) * 80) / 100;
                break;
            case 10:
                carsPerHour = ((speed * 221) * 77) / 100;
                break;

        }
        return carsPerHour;
    }

    public int prodPerMinute(int speed) {
        int carsPerMinute = prodRateHour(speed)/ 60;
        return carsPerMinute;
    }


    public static void main(String[] args) {
        Rate rate = new Rate();
        System.out.println("Masini pe ora " + rate.prodRateHour( 4));
        System.out.println("Masini pe minut " + rate.prodPerMinute(4));

    }

}













