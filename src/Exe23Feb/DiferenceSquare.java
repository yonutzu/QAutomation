package Exe23Feb;

import Utils.Utils;

/*Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

        The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)² = 55² = 3025.

        1) The sum of the squares of the first ten natural numbers is 1² + 2² + ... + 10² = 385.

        Hence the difference between the square of the sum of the first ten natural numbers and the sum of the squares of the first ten natural numbers is 3025 - 385 = 2640.*/
public class DiferenceSquare {
    public static void main(String[] args) {
DiferenceSquare diferenta = new DiferenceSquare();
        System.out.println(diferenta.diference(Utils.scanner().nextInt()));
    }

    public int squareOfSum (int n){
//        (1+2+3+.....n)^2
        int sum = 0;

        for(int i = 1; i <=n; i++){
            sum = sum + i;

        }
        return (int) Math.pow(sum, 2); //ridicare la putere

    }

    public int sumOfSquare (int n){
//
       int sum = 0;
       for(int i = 1; i<=n; i++){
           sum= (int) (sum + Math.pow(i,2));
       }
       return sum;
    }

    public int diference (int n){
        return squareOfSum(n) - sumOfSquare(n);

    }
}
