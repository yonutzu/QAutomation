package Exe14Mar.JavaInterface;



public class Runner {
    public static void main(String[] args) {
        JavaInterface obj = new JavaClassInterface();
        obj.doarme();
        obj.mananca();
        obj.scoateSunet();
        obj.seJoaca();
((JavaClassInterface) obj).zboara();
        System.out.println(((JavaClassInterface) obj).newValue("255"));
obj.nume();

    }
}
