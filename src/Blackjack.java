import javax.swing.text.StyleContext;

public class Blackjack {
    public static int parseCard (String card){
    switch (card){
        case "ace":
            return 11;
        case"two":
            return 2;
        case "three":
            return 3;
        case "four":
            return 4;
        case "five":
            return 5;
        case "six":
            return 6;
        case "seven":
            return 7;
        case"eight":
            return 8;
        case "nine":
            return 9;
        case "ten":
        case "jack":
        case "queen":
        case "king":
            return 10;
        default:
            return 0;

    }
    }
    public static boolean isBlackjack(String card1, String card2){
        int valoareCard1 = parseCard(card1);
        int valoareCard2 = parseCard(card2);
        if (valoareCard1 +valoareCard2 == 21){
            return true;
        }else{
            return false;
        }
    }
    public static String largeHand (boolean isBlackjack, int dealerScore){
        if (isBlackjack) {
            if(dealerScore ==11 || dealerScore ==10){
                return "S";
            }else{
                return "W";
            }
        }else {
            return "P";
        }
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }
        if (handScore <= 11) {
            return "H";
        }
        if (dealerScore >= 7) {
            return "H";
        } else {
            return "S";
        }
    }
        // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
        // This function is already implemented and does not need to be edited. It pulls the other functions together in a
        // complete decision tree for the first turn.

    public static String firstTurn(String card1, String card2, String dealerCard){
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

            if(20< handScore){
                return largeHand(isBlackjack(card1, card2), dealerScore);
}else{
                return smallHand(handScore, dealerScore);
            }
    }
    public static void main (String[]args){
//        LargeHand
        System.out.println("Afiseaza S " + firstTurn("ace", "ten", "ten"));
        System.out.println("Afiseaza W " + firstTurn("ace", "ten","five"));
        System.out.println("Afiseaza P " + firstTurn("ace", "ace", "five"));

//        SmallHand
        System.out.println("Afiseaza S " + firstTurn("ten", "nine", "five"));
        System.out.println("Afiseaza H " + firstTurn("five", "six", "five"));
        System.out.println("Afiseaza H " + firstTurn("seven", "seven", "eight"));
        System.out.println("Afiseaza S " + firstTurn("seven", "seven", "six"));
    }
}
