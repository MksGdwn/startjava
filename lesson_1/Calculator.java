public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        String operation = "+";

        switch(operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "^":
                System.out.println(Math.pow(a, b));
                break;
            case "%":
                System.out.println(a % b);
                break;
        }
    }
}