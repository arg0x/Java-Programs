
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        // add
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        // sub
        int sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);
        // mul
        int mul = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mul);
        // div
        double div = ((double) num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + div);

    }
}
