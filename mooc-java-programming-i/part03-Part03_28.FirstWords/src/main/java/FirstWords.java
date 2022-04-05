
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] arr = string.split(" ");

            System.out.println(arr[0]);
        }
    }
}
