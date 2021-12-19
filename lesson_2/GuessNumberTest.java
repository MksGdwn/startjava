import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first player name: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Enter second player name: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);
        while(true) {
            game.play();

            System.out.print("Do you want to start a new game? [yes/no]: ");
            String userAnswer = scanner.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("I don't understand. Do you want to start a new game? [yes/no]: ");
                userAnswer = scanner.nextLine();
            }

            if (!userAnswer.equals("yes")) {
                break;
            } 
        }
    }
}