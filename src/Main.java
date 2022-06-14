import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harryPotter = generateGryffindorStudent("HarryPotter");
        GryffindorStudent hermioneGranger = generateGryffindorStudent("HermioneGranger");
        GryffindorStudent ronWeasley = generateGryffindorStudent("RonWeasley");
        harryPotter.print();
        hermioneGranger.print();
        ronWeasley.print();
        System.out.println();
        SlytherinStudent dracoMalfoy = generateSlytherinStudent("DracoMalfoy");
        SlytherinStudent grahamMontague = generateSlytherinStudent("GrahamMontague");
        SlytherinStudent gregoryGoyle = generateSlytherinStudent("GregoryGoyle");
        dracoMalfoy.print();
        grahamMontague.print();
        gregoryGoyle.print();
        System.out.println();
        HufflepuffStudent zachariahSmith = generateHufflepuffStudent("ZachariahSmith");
        HufflepuffStudent cedricDiggory = generateHufflepuffStudent("CedricDiggory");
        HufflepuffStudent justinFinchFletchley = generateHufflepuffStudent("JustinFinchFletchley");
        zachariahSmith.print();
        cedricDiggory.print();
        justinFinchFletchley.print();
        System.out.println();
        RavenclawStudent zhouChang = generateRavenclawStudent("ZhouChang");
        RavenclawStudent padmaPatil = generateRavenclawStudent("PadmaPatil");
        RavenclawStudent marcusBelby = generateRavenclawStudent("MarcusBelby");
        zhouChang.print();
        padmaPatil.print();
        marcusBelby.print();
        System.out.println();

        hermioneGranger.compareGryffindorStudents(ronWeasley);
        zhouChang.compareRavenclawStudents(marcusBelby);
        zachariahSmith.compareHufflepuffStudents(cedricDiggory);
        dracoMalfoy.compareSlytherinStudents(grahamMontague);
        System.out.println();

        harryPotter.compareHogwartsStudents(dracoMalfoy);
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
}