import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        do {
            int userInput = scanner.nextInt();

            if (userInput == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (userInput > number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");

            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }

        } while(true);
    }
}