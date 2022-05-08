import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                this.list.add(add);

            } else if (command.equals("list")) {
                this.list.print();

            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int num = scanner.nextInt();
                this.list.remove(num);
            }

        }
    }

}
