package TimBuchalka.section1_2_3;

public class EqualSumChecker {
    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, -1, 2));

        System.out.println(hasTeen(1, 111, 111));

        System.out.println(isTeen(15));

        System.out.println(area(5,4));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) {
            return true;

        }
        return false;
    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        return false;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return radius * radius * 3.14;
        }
    }


    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }
}
