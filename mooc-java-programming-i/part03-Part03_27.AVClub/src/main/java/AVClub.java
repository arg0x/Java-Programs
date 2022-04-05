
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] arr = string.split(" ");
            for (String i : arr) {
                // System.out.println(i);
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }

        }

    }
}
