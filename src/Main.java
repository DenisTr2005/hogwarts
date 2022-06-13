public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("HarryPotter",rInt(),rInt(),rInt(),rInt(),rInt());
        Gryffindor hermioneGranger = new Gryffindor("HermioneGranger", rInt(),rInt(),rInt(),rInt(),rInt());
        Gryffindor ronWeasley = new Gryffindor("RonWeasley",rInt(),rInt(),rInt(),rInt(),rInt());
        studentInfo(harryPotter);
        studentInfo(hermioneGranger);
        studentInfo(ronWeasley);
        Slytherin dracoMalfoy = new Slytherin("DracoMalfoy",rInt(),rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        Slytherin grahamMontague = new Slytherin("GrahamMontague",rInt(),rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        Slytherin gregoryGoyle = new Slytherin("GregoryGoyle",rInt(),rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        studentInfo(dracoMalfoy);
        studentInfo(grahamMontague);
        studentInfo(gregoryGoyle);
        Hufflepuff zachariahSmith = new Hufflepuff("ZachariahSmith",rInt(),rInt(),rInt(),rInt(),rInt());
        Hufflepuff cedricDiggory = new Hufflepuff("CedricDiggory",rInt(),rInt(),rInt(),rInt(),rInt());
        Hufflepuff justinFinchFletchley = new Hufflepuff("JustinFinchFletchley",rInt(),rInt(),rInt(),rInt(),rInt());
        studentInfo(zachariahSmith);
        studentInfo(cedricDiggory);
        studentInfo(justinFinchFletchley);
        Ravenclaw zhouChang = new Ravenclaw("ZhouChang",rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        Ravenclaw padmaPatil = new Ravenclaw("PadmaPatil",rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        Ravenclaw marcusBelby = new Ravenclaw("MarcusBelby",rInt(),rInt(),rInt(),rInt(),rInt(),rInt());
        studentInfo(zhouChang);
        studentInfo(padmaPatil);
        studentInfo(marcusBelby);
        System.out.println();

        compareStudentsG(hermioneGranger, ronWeasley);
        compareStudentsR(zhouChang,marcusBelby);
        compareStudentsH(zachariahSmith,cedricDiggory);
        compareStudentsS(dracoMalfoy,grahamMontague);
        System.out.println();

        compareStudentsPowerMagic(harryPotter,dracoMalfoy);
    }

    private static int rInt() {
        return (int) (Math.random() * 100);
    }
    private static void studentInfo(Hogwarts student) {
        System.out.println(student.getName() + ": " + "Hogwarts{" +
                "magicPower=" + student.getMagicPower() +
                ", transgressDistance=" + student.getTransgressDistance() +
                "} " + student);
    }
    private static void compareStudentsG(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }
    private static void compareStudentsR(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getCreativity()+student1.getIntelligence()+student1.getWisdom()+student1.getWit();
        int sum2 = student2.getCreativity()+student2.getIntelligence()+student2.getWisdom()+student2.getWit();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }
    private static void compareStudentsH(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getDiligence()+ student1.getHonesty()+ student1.getLoyalty();
        int sum2 = student2.getDiligence()+ student2.getHonesty()+ student2.getLoyalty();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
    }
    private static void compareStudentsS(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getAmbition()+ student1.getCunning()+ student1.getDetermination()+student1.getPower()+
                student1.getResourcefulness();
        int sum2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getPower() +
                student2.getResourcefulness();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
    }
    private static void compareStudentsPowerMagic(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.getMagicPower()+ student1.getTransgressDistance();
        int sum2 = student2.getMagicPower()+ student2.getTransgressDistance();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }
    }
}