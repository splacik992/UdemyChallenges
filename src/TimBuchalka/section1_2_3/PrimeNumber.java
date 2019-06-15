package TimBuchalka.section1_2_3;

public class PrimeNumber {

    private static boolean prime(int n)
    {
        if (n>2)
        {
            double sq = Math.sqrt(n);
            if(n%2==0)
                return false;
            else
            {
                for(int i=3; i<=sq; i+=2)
                {
                    if(n%i==0)
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        else return n == 2;
    }

    public static void main(String args[])
    {
        int n=4;
        for (String arg : args) {
            try {
                n = Integer.parseInt(arg);
                if (prime(n)) System.out.println(n + " jest liczba pierwsza");
                else System.out.println(n + " nie jest liczba pierwsza");
            } catch (NumberFormatException ex) {
                System.out.println(arg + " nie jest liczba calkowita");
            }
        }
    }
}
