package TimBuchalka.section1_2_3;

public class BarkingDog {


    public static void main(String[] args) {

        shouldWakeUp(false,1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }
        return false;

    }

}
