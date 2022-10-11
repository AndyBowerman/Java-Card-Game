import Card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    protected ArrayList<Card> deckOfCards = new ArrayList<>();
    protected List<Card> removedCards = new ArrayList<Card>();
    public CardGame() {
        this.deckOfCards.add(new Card("U+2660", "2", 2));
        this.deckOfCards.add(new Card("U+2660", "3", 3));
        this.deckOfCards.add(new Card("U+2660", "4", 4));
        this.deckOfCards.add(new Card("U+2660", "5", 5));
        this.deckOfCards.add(new Card("U+2660", "6", 6));
        this.deckOfCards.add(new Card("U+2660", "7", 7));
        this.deckOfCards.add(new Card("U+2660", "8", 8));
        this.deckOfCards.add(new Card("U+2660", "9", 9));
        this.deckOfCards.add(new Card("U+2660", "10", 10));
        this.deckOfCards.add(new Card("U+2660", "J", 11));
        this.deckOfCards.add(new Card("U+2660", "Q", 12));
        this.deckOfCards.add(new Card("U+2660", "K", 13));
        this.deckOfCards.add(new Card("U+2660", "A", 14));
        this.deckOfCards.add(new Card("U+2665", "2", 2));
        this.deckOfCards.add(new Card("U+2665", "3", 3));
        this.deckOfCards.add(new Card("U+2665", "4", 4));
        this.deckOfCards.add(new Card("U+2665", "5", 5));
        this.deckOfCards.add(new Card("U+2665", "6", 6));
        this.deckOfCards.add(new Card("U+2665", "7", 7));
        this.deckOfCards.add(new Card("U+2665", "8", 8));
        this.deckOfCards.add(new Card("U+2665", "9", 9));
        this.deckOfCards.add(new Card("U+2665", "10", 10));
        this.deckOfCards.add(new Card("U+2665", "J", 11));
        this.deckOfCards.add(new Card("U+2665", "Q", 12));
        this.deckOfCards.add(new Card("U+2665", "K", 13));
        this.deckOfCards.add(new Card("U+2665", "A", 14));
        this.deckOfCards.add(new Card("U+2663", "2", 2));
        this.deckOfCards.add(new Card("U+2663", "3", 3));
        this.deckOfCards.add(new Card("U+2663", "4", 4));
        this.deckOfCards.add(new Card("U+2663", "5", 5));
        this.deckOfCards.add(new Card("U+2663", "6", 6));
        this.deckOfCards.add(new Card("U+2663", "7", 7));
        this.deckOfCards.add(new Card("U+2663", "8", 8));
        this.deckOfCards.add(new Card("U+2663", "9", 9));
        this.deckOfCards.add(new Card("U+2663", "10", 10));
        this.deckOfCards.add(new Card("U+2663", "J", 11));
        this.deckOfCards.add(new Card("U+2663", "Q", 12));
        this.deckOfCards.add(new Card("U+2663", "K", 13));
        this.deckOfCards.add(new Card("U+2663", "A", 14));
        this.deckOfCards.add(new Card("U+2666", "2", 2));
        this.deckOfCards.add(new Card("U+2666", "3", 3));
        this.deckOfCards.add(new Card("U+2666", "4", 4));
        this.deckOfCards.add(new Card("U+2666", "5", 5));
        this.deckOfCards.add(new Card("U+2666", "6", 6));
        this.deckOfCards.add(new Card("U+2666", "7", 7));
        this.deckOfCards.add(new Card("U+2666", "8", 8));
        this.deckOfCards.add(new Card("U+2666", "9", 9));
        this.deckOfCards.add(new Card("U+2666", "10", 10));
        this.deckOfCards.add(new Card("U+2666", "J", 11));
        this.deckOfCards.add(new Card("U+2666", "Q", 12));
        this.deckOfCards.add(new Card("U+2666", "K", 13));
        this.deckOfCards.add(new Card("U+2666", "A", 14));
    }

    public void getDeckOfCards() {
        for (Card card: deckOfCards) {
            System.out.println(card.toString());
        }
    }

    public Card dealCard() {
        Card cardDealt = deckOfCards.get(deckOfCards.size() - 1);
        deckOfCards.remove(deckOfCards.size() - 1);
        removedCards.add(cardDealt);
        return cardDealt;
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (o1, o2)-> Integer.compare(o1.getValue(), o2.getValue()));
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        ArrayList<Card> hearts = new ArrayList<Card>();
        ArrayList<Card> diamonds = new ArrayList<Card>();
        ArrayList<Card> spades = new ArrayList<Card>();
        ArrayList<Card> clubs = new ArrayList<Card>();

        sortDeckInNumberOrder();

        for (int i = 0; i < deckOfCards.size(); i++) {
            if(deckOfCards.get(i).getSuit().equals("U+2665")) {
                hearts.add(deckOfCards.get(i));
            } else if(deckOfCards.get(i).getSuit().equals("U+2666")) {
                diamonds.add(deckOfCards.get(i));
            } else if(deckOfCards.get(i).getSuit().equals("U+2660")) {
                spades.add(deckOfCards.get(i));
            } else {
                clubs.add(deckOfCards.get(i));
            }
        }

        deckOfCards.clear();
        deckOfCards.addAll(hearts);
        deckOfCards.addAll(diamonds);
        deckOfCards.addAll(spades);
        deckOfCards.addAll(clubs);
        return deckOfCards;
    }

    ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
