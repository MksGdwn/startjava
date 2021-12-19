public class Calculator {
    public void calculate(int a, int b, String operation) {
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