package TimBuchalka.section1_2_3;

public class SwitchDay {

    public static void main(String[] args) {

        printDayOfTheWeek(0);


        int count = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                count++;
                sum+= i;
                System.out.println(i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println(sum + "sum");
    }

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
