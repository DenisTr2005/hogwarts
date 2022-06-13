public class Hogwarts {
    private final String name;

    public String getName() {
        return name;
    }

    private final int magicPower;
    private final int transgressDistance;

    public Hogwarts(String name, int magicPower, int transgressDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }
}
