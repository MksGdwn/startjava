public class Variable {
    public static void main(String[] args) {
        byte b = 1;
        short s = 4;
        int i = 1000;
        long l = 1_000_000L;
        char c = 1028;
        float f = 10.0f;
        double d = 100_000.0;
        boolean bool = true;

        System.out.printf(
            "Byte: %d\n" +
            "Short: %d\n" +
            "Integer: %d\n" +
            "Long: %d\n" +
            "Character: " + c + "\n" +
            "Float: %f\n" +
            "Double: %f\n" +
            "Boolean: " + bool + "\n", b, s, i, l, f, d);
    }
}