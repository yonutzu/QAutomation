package Exe21Feb;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second String: ");
        String str2 = scanner.nextLine();

        if(str1.equals(str2)){
            System.out.println("The two Strings are equals");
        }else{
            System.out.println("The two Strings are not equals");
        }

//        compare the two Strings lexicographically

        int result = str1.compareTo(str2);
        if(result<0){
            System.out.println("The first String comes before the second String ");
        } else if (result>0) {
            System.out.println("The first String comes after the second String");
        }else{
            System.out.println("The two Strings are equal");
        }
    }
}