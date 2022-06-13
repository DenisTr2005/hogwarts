public class Hufflepuff extends Hogwarts{
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public Hufflepuff(String name, int magicPower, int transgressDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
