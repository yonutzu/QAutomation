package Exe21Mar;

/*
 Java program to display all integers within the range 100-150 whose sum of digits is an even number
 */
public class Range {
    public static void main(String[] args) {
        Range obj = new Range();
        obj.sumOfDigits();
    }

    public void sumOfDigits() {
        for (int i = 100; i <= 150; i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num =num/   10;
            }
            if(sum%2==0){
                System.out.println("Numarul par este: " + i);
            }
        }
    }
}
