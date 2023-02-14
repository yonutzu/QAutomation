import java.util.Arrays;

public class Character {
    public static void main(String[] args) {
        String a = "Java Language";
        String [] elements = a.split("\\s+");
        System.out.println("Elements : " + Arrays.toString(elements));
    }

}
