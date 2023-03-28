package Exe02Mar;

public class TwoFer {
    public static void main(String[] args) {
TwoFer obj = new TwoFer();
String  input = Utils.Utils.scanner().next();
String value = "";
        obj.names(input);
    }
public void names (String name){
        if(name.isEmpty()){
            System.out.println("One for you, one for me");
        }else{
            System.out.println("One for " +name + " one for me");
        }
}
}
