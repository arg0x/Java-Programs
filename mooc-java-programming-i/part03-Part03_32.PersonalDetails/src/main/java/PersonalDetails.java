
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int great = 0;
        int sum = 0;
        String mark = "";
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] array = string.split(",");
            int year = Integer.valueOf(array[1]);
            sum = sum + year;
            count = count + 1;
            String name = array[0];
            int length = name.length();
            if (length > great) {
                great = length;
                mark = name;
            }

        }
        System.out.println("Longest name: " + mark);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    }
}
