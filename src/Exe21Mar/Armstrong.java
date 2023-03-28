package Exe21Mar;

import Utils.Utils;

/*
Armstrong number is a number that is equal to the sum of cubes of its digits.
For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
153 = (111)+(555)+(333)
where:
(111)=1
(555)=125
(333)=27
So:
1+125+27=153
 */
public class Armstrong {
    public static void main(String[] args) {
Armstrong obj = new Armstrong();
obj.isArmstong(Utils.scanner().nextInt());
    }

    public boolean isArmstong(int number) {
        int sum = 0;
        int original = number;

//        transformam int in String:

        int digi = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digi);
            number /= 10;
        }
        return  sum == original? true:false;
    }
}
