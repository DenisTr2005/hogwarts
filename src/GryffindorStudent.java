public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int ability() {
        return nobility+honor+bravery;
    }

    public void compareGryffindorStudents(GryffindorStudent otherStudent) {
        System.out.print(getName());
        if (ability() > otherStudent.ability()) {
            System.out.print(" лучший Гриффиндорец, чем ");
        } else if (ability() == otherStudent.ability()) {
            System.out.print(" такойже Гриффиндорец, как ");
        } else {
            System.out.print(" худший Гриффиндорец, чем ");
        }
        System.out.println(otherStudent.getName() + " (" + ability() + " vs " + otherStudent.ability() + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " - GryffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}