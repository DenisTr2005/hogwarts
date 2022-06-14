public class SlytherinStudent extends  HogwartsStudent{
    private  int cunning;
    private  int determination;
    private int ambition;
    private  int resourcefulness;
    private  int power;

    public SlytherinStudent(String name, int magicPower, int transgressDistance, int cunning, int determination,
                            int ambition, int resourcefulness, int power) {
        super(name, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    private int ability() {
        return cunning + determination + ambition + resourcefulness + power;
    }

    public void compareSlytherinStudents(SlytherinStudent otherStudent) {
        System.out.print(getName());
        if (ability() > otherStudent.ability()) {
            System.out.print(" лучший Слизеринец, чем ");
        } else if (ability() == otherStudent.ability()) {
            System.out.print(" такойже Слизеринец, как ");
        } else {
            System.out.print(" худший Слизеринец, чем ");
        }
        System.out.println(otherStudent.getName() + " (" + ability() + " vs " + otherStudent.ability() + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " - SlytherinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
    }
}

