package Exercitii;

/*
        Two-fer or 2-fer is short for two for one. One for you and one for me.

        Given a name, return a string with the message:

        One for name, one for me.
        Where "name" is the given name.

        However, if the name is missing, return the string:

        One for you, one for me.
        Here are some examples:

        Name    String to return
        Alice    One for Alice, one for me.
        Bob    One for Bob, one for me.
        One for you, one for me.
        Zaphod    One for Zaphod, one for me.
 */

public class TwoFer {

    private String name;

    public void setName(String name){
        this.name = name;

    }


    public static void main(String[] args) {
     TwoFer twoFer = new TwoFer();
     twoFer.setName("Ionut");
     twoFer.sentence();
     twoFer.sentence();

     TwoFer twoFer1 = new TwoFer();
     twoFer1.sentence();
    }

    public void sentence (){
       if(name== null){
           System.out.println("One for you, one for me");
       }else {
           System.out.println("One for "+ name+ ",one for me");

       }
    }

}


