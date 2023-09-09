package OtherPractice.Other.Cards;

public class Cards {
    public static void main(String[] args) {
        Card3 aceOfSpades = new Card3(Rank.ACE, Suit.SPADES);

        System.out.println(aceOfSpades.getRank() + " of " + aceOfSpades.getSuit());
        System.out.println(aceOfSpades);
    }
}
