import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a sign for a mathematical operation: ");
            String symbol = scanner.nextLine();

            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator = new Calculator();
            calculator.calculate(number1, number2, symbol);

            System.out.print("Do you want to continue calculating? [yes/no]: ");
            String userAnswer = scanner.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("I don't understand. Do you want to continue calculating? [yes/no]: ");
                userAnswer = scanner.nextLine();
            }

            if (!userAnswer.equals("yes")) {
                break;
            } 
        }
    }
}