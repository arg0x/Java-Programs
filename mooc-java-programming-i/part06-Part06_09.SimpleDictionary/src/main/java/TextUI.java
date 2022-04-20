import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.next();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            checkCommand(command);
        }
    }

    public void checkCommand(String command) {
        if (command.equals("add")) {
            addWord();
        } else if (command.equals("search")) {
            searchFor();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void addWord() {
        System.out.print("Word: ");
        String word = this.scanner.next();
        System.out.print("Translation: ");
        String translation = this.scanner.next();
        simpleDictionary.add(word, translation);
    }

    public void searchFor() {
        System.out.print("To be Translated: ");
        String translate = this.scanner.next();
        System.out.print("Translation: ");
        String translation = simpleDictionary.translate(translate);
        if (translation == null) {
            System.out.println("Word " + translate + " was not found");
        } else {
            System.out.println(simpleDictionary.translate(translate));
        }
    }
}
