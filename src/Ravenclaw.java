public class Ravenclaw extends Hogwarts{
    private final int intelligence;

    private final int wisdom;

    private final int wit;
    private final int creativity;

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public Ravenclaw(String name, int magicPower, int transgressDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }


}
