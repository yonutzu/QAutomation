//package Exercitii_3;
//
//public class WizardsAndWarriors {
//    public static void main(String[] args){
//        Wizzard wizzard = new Wizzard();
//        wizzard.prepareSpell();
//    }
//}
//        abstract class Fighter {
//            boolean isVulnerable() {
//                {
//                return false;
//    }
//
//}
//        abstract int damagePoints(Fighter fighter);
//}
//
//class Worrior {
//
//    @Override
//    public String toString(){
//        return "Fighter is a Worrior";
//    }
//
//    @Override
//    int damagePoints(Fighter wizard){
//        return wizard.isVulnerable() ? 10:6;
//    }
//}
//class Wizard {
//int spells;
//    @Override
//    boolean isVulnerable(){
//        return spells == 0;
//    }
//
//    @Override
//    int damagePoints(Fighter worrior) {
//        if (spells == 0) {
//            return 3;
//        }
//        spells -= 1;
//        return 12;
//    }
//
//    void prepareSpell(){
//        spells += 1;
//
//    }
//
//}
