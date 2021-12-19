import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a sign for a mathematical operation: ");
        String symbol = scanner.nextLine();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        calculator.calculate(number1, number2, symbol);
    }
}