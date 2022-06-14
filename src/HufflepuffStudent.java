public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;
    public HufflepuffStudent(String name, int magicPower, int transgressDistance, int diligence, int loyalty,
                             int honesty) {
        super(name, magicPower, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int ability() {
        return diligence + loyalty + honesty;
    }
    public void compareHufflepuffStudents(HufflepuffStudent otherStudent) {
        System.out.print(getName());
        if (ability() > otherStudent.ability()) {
            System.out.print(" лучший Пуффендуец, чем ");
        } else if (ability() == otherStudent.ability()) {
            System.out.print(" такойже Пуффендуец, как ");
        } else {
            System.out.print(" худший Пуффендуец, чем ");
        }
        System.out.println(otherStudent.getName() + " (" + ability() + " vs " + otherStudent.ability()  + ")");
    }

    @Override
    public String toString() {
        return super.toString() + " - HufflepuffStudent{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
