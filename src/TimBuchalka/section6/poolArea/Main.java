package TimBuchalka.section6.poolArea;

public class Main {
    public static void main(String[] args) {


        System.out.println("Cuboid info: ");
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println(cuboid.gerVolume() + " - Volume");
        System.out.println(cuboid.getHeight()+ " - Height");
        System.out.println(cuboid.getArea()+ " - Area");
        System.out.println(cuboid.getLenght() + " - Lenght");
    }
}
