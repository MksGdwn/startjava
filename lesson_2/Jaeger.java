public class Jaeger{
    String modelName;
    String mark;
    String origin;
    float height;
    float weight;
    int strength;
    int armor;

    public boolean drift() {
        return true;
    }

    public void mover() {
        System.out.println("Jaeger is moving");
    }

    public String scanKaijy() {
        return "Jaeger is scanning";
    }

    public void useVortexCannon() {
        System.out.println("Vortex cannon is activated");
    }
}