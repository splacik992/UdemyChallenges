package TimBuchalka.section5;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        aReadingUserInput();
    }


    public static void aReadingUserInput() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
        }
        System.out.println("sum of numbers : " + sum);
        scanner.close();
    }

}

