
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp = 0;
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }

            String[] array = string.split(",");
            int age = Integer.valueOf(array[1]);

            arrayList.add(age);
            System.out.println(arrayList);
            temp = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                int number = arrayList.get(i);
                if (temp < number) {
                    temp = number;
                }

            }
        }
        System.out.println("Age of the oldest: " + temp);

    }
}
