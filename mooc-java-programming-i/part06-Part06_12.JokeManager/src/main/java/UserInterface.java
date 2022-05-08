import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            commands();
            String command = scanner.nextLine();
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(manager.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            } else if (command.equals("X")) {
                break;
            }

        }
    }

    public void commands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

}
