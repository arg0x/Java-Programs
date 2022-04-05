
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPositives = 0;
        int sumOfPositives = 0;
        double avgOfPositives = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number > 0) {
                numberOfPositives = numberOfPositives + 1;
                sumOfPositives = sumOfPositives + number;
                avgOfPositives = (double) sumOfPositives / (double) numberOfPositives;
            }
            if (avgOfPositives > 0 && number == 0) {
                System.out.println(avgOfPositives);
                break;

            } else if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;

            }

        }

    }
}
