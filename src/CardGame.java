import Card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private String name;

    public CardGame(String name) {
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
        this.name = name;
    }

    public void getDeckOfCards() {
        for (Card card: deckOfCards) {
            System.out.println(card.toString());
        }
    }

    public String getName() {
        return name;
    }
    public Card dealCard() {
        return deckOfCards.get(deckOfCards.size() - 1);
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (o1, o2)-> Integer.compare(o1.getValue(), o2.getValue()));
        return deckOfCards;
    }

    public Array
}
