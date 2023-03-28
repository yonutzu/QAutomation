package Exe21Mar;

/*
Java program to display the sum of n numbers using an array
 */
public class SumOfN {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 9, 7, 3, 4};
        SumOfN obj = new SumOfN();
        System.out.println(obj.sum(numbers));
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i > array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
