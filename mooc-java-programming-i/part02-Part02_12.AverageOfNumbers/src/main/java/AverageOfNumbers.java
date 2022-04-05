
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avgOfNumbers = 0;
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            numberOfNumbers = numberOfNumbers + 1;
            sumOfNumbers = sumOfNumbers + number;
            avgOfNumbers = (double) sumOfNumbers / (double) numberOfNumbers;
        }
        System.out.println("Average of the numbers: " + avgOfNumbers);

    }
}
