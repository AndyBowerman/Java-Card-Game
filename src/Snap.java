import Card.Card;

import java.util.Scanner;

public class Snap extends CardGame{
    private Card previousCard;
    private Card currentCard;

    public Snap(String name) {
        super(name);
    }

    public void promptEnterKey() {
        System.out.println("Something");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        playSnap();
    }

    public void playSnap() {
        currentCard = dealCard();
        System.out.println(currentCard);
    }
}
