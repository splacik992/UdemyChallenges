package TimBuchalka.section5;

public class FlourPacker {


    public static void main(String[] args) {
        canPack(2,0,10);
    }
    public static boolean  canPack (int bigCount, int smallCount, int goal) {
        bigCount = 5 * bigCount;
        int goal1 = bigCount + smallCount;

        if (goal >= goal1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return false;
    }
}
