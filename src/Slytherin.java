public class Slytherin extends  Hogwarts{
    private final int cunning;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int power;

    public Slytherin(String name, int magicPower, int transgressDistance, int cunning, int determination, int ambition,
                     int resourcefulness, int power) {
        super(name, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }
}

