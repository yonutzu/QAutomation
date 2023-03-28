package Exe21Mar;

import Utils.Utils;

/*
 Java Program to Check Whether the Generated Random Number Is Even or Odd
 */
public class WeatherOddOrEven {
    public static void main(String[] args) {
WeatherOddOrEven obj = new WeatherOddOrEven();
obj.oddOrEven(Utils.randomNumber(99000));
    }
    public void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number + " Este par");
        }else{
            System.out.println(number + " Este impar");
        }

    }



}
