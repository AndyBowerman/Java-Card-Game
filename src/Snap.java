import Card.Card;

import java.util.Timer;

import java.util.Scanner;
import java.util.TimerTask;

public class Snap extends CardGame{
    private String playerOne;
    private String playerTwo;
    protected int count = 0;
    private Timer timer = new Timer();
    private final Scanner scanner = new Scanner(System.in);
    String answer = "incorrect";

    public Snap(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void playSnap(int num) {
        if(count < 52) {
            shuffleDeck();
            System.out.println("Press enter for a card");
            scanner.nextLine();
            Card currentCard = dealCard();
            System.out.println(currentCard);
            count++;
            if (currentCard.getValue() == num) {
                System.out.println("Type 'snap' to win!");
                timeLimit(currentCard.getValue());
                catchInput();
            } else {
                playSnap(currentCard.getValue());
            }
        } else {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }

    public void timeLimit(int currentCardVal) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkWinner(currentCardVal);
                }
            }, 2*1000);
    }

    public void catchInput() {
        answer = scanner.nextLine().toLowerCase();
    }

    public void checkWinner(int currentCardVal) {
        if(answer.equals("snap")) {
            declareWinner();
        } else {
            System.out.println("Too slow!");
            System.exit(0);
        }
    }

    public void declareWinner() {
        if(count % 2 != 0) {
            System.out.println(playerOne + " wins!");
        } else {
            System.out.println(playerTwo + " wins!");
        }
        System.exit(0);
    }
}
