import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeSearch recipeSearch;

    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.recipeSearch = new RecipeSearch();
    }

    public void start() {
        System.out.print("File to read: ");
        String path = scanner.nextLine();
        recipeSearch.recipeLocation(path);
        commands();
        while (true) {
            System.out.print("\nEnter the command: ");
            String command = scanner.nextLine();
            if (command.equals("list")) {
                recipeSearch.list();
            }
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchFor = scanner.nextLine();
                recipeSearch.search(searchFor);
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = scanner.nextInt();
                recipeSearch.searchTime(time);
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeSearch.searchIngredient(ingredient);
            }
        }
    }

    public void commands() {
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

}
