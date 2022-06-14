public class RavenclawStudent extends HogwartsStudent{
    private int intelligence;

    private int wisdom;

    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressDistance, int intelligence, int wisdom, int wit,
                            int creativity) {
        super(name, magicPower, transgressDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability() {
        return intelligence + wisdom + wit + creativity;
    }

    public void compareRavenclawStudents(RavenclawStudent otherStudent) {
        System.out.print(getName());
        if (ability() > otherStudent.ability()) {
            System.out.print(" лучший Когтевранец, чем ");
        } else if (ability() == otherStudent.ability()) {
            System.out.print(" такойже Когтевранец, как ");
        } else {
            System.out.print(" худший Когтевранец, чем ");
        }
        System.out.println(otherStudent.getName() + " (" + ability() + " vs " + otherStudent.ability() + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " - RavenclawStudent{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
