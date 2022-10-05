import Card.Card;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Snap extends CardGame{
    private String playerOne;
    private String playerTwo;
    protected int count = 0;

    public Snap(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playSnap(int num) {
        System.out.println("Press enter for a card");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Card currentCard = dealCard();
        System.out.println(currentCard);
        count++;
        if(currentCard.getValue() == num){
            declareWinner();
        } else {
            playSnap(currentCard.getValue());
        }
    }

    public void declareWinner() {
        if(count % 2 != 0) {
            System.out.println(playerOne + " wins!");
        } else {
            System.out.println(playerTwo + " wins!");
        }
    }
}
