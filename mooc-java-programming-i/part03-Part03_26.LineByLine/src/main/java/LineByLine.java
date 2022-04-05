
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }

            String[] piece = string.split(" ");

            for (int i = 0; i < piece.length; i++) {
                System.out.println(piece[i]);
            }
        }

    }
}
