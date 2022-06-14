public abstract class HogwartsStudent {
    private String getName;
    private int magicPower;
    private int transgressDistance;
    public HogwartsStudent(String name, int magicPower, int transgressDistance) {
        this.getName = name;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return getName;
    }

    public void setName(String name) {
        this.getName = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    private int ability() {
        return magicPower + transgressDistance;
    }

    public void compareHogwartsStudents(HogwartsStudent otherStudent) {
        System.out.print(getName);
        if (ability() > otherStudent.ability()) {
            System.out.print(" обладает большей мощностью магии, чем ");
        } else if (ability() == otherStudent.ability()) {
            System.out.print(" обладает одинаковой мощностью магии с ");
        } else {
            System.out.print(" обладает меньшей мощностью магии, чем ");
        }
        System.out.println(otherStudent.getName + " (" + ability() + " vs " + otherStudent.ability() + ")");
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + getName + '\'' +
                ", magicPower=" + magicPower +
                ", transgressDistance=" + transgressDistance +
                '}';
    }
    public void print() {
        System.out.println(this);
    }
}
