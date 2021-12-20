public class JaegerTest {
    public static void main(String[] args) {
            Jaeger jaeger1 = new Jaeger();
            Jaeger jaeger2 = new Jaeger();

            jaeger1.setModelName("Guardian Bravo");
            jaeger1.setMark("Mark-6");
            jaeger1.setHeight(73.21F);
            jaeger1.setWeight(1.975F);
            jaeger1.setStrength(5);
            jaeger1.setArmor(9);

            jaeger2.setModelName("Gipsy Avenger");
            jaeger2.setMark("Mark-6");
            jaeger2.setHeight(81.77f);
            jaeger2.setWeight(2.004f);
            jaeger2.setStrength(8);
            jaeger2.setArmor(8);

            System.out.println("Model name: " + jaeger1.getModelName() + "\n" +
                    "Series: " + jaeger1.getMark());
            System.out.println("Model name: " + jaeger2.getModelName() + "\n" +
                    "Series: " + jaeger2.getMark());
    }
}