package TimBuchalka.section1_2_3;

public class TheLargerPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
    }


    public static int getLargestPrime(int number) {

        int largestPrime = 0;
        if (number < 2) {
            return -1;
        }
        for (int i = number; i > 1; i--) {
            if (number % i == 0) {
                int count = 0;
                for (int j = i; j > 1; j--) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    largestPrime = i;
                    return largestPrime;
                }
            }
        }
        return largestPrime;
    }
}

