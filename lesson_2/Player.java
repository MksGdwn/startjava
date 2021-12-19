public class Player {
    private static int count = 1;

    private String name;
    private int number = count++;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }
}