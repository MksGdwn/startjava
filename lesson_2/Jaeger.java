public class Jaeger{
    String modelName;
    String mark;
    float height;
    float weight;
    int strength;
    int armor;

    public Jaeger() {}

    public Jaeger(String modelName,
            String mark,
            float height,
            float weight,
            int strength,
            int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

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