
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        int great = 0;
        String newName = "";
        while (true) {
            string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String[] array = string.split(",");
            String name = array[0];
            int age = Integer.valueOf(array[1]);
            if (age > great) {
                great = age;
                newName = name;

            }
        }
        System.out.println(newName);

    }
}
