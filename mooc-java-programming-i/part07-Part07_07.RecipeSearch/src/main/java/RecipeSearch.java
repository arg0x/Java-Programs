
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private ArrayList<Recipes> recipeList;

    public RecipeSearch() {
        this.recipeList = new ArrayList<>();
    }

    public void recipeLocation(String path) {
        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String contents = scanner.nextLine();
                    if (!contents.isEmpty()) {
                        ingredients.add(contents);
                    } else if (contents.isEmpty()) {
                        break;
                    }
                }
                recipeList.add(new Recipes(recipeName, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void list() {
        System.out.println("Recipes:");
        for (int i = 0; i < recipeList.size(); i++) {
            System.out.println(
                    recipeList.get(i).recipeName() + "," + " cooking time: " + recipeList.get(i).cookingTime());
        }
    }

    public void search(String recipe) {
        System.out.println("\nRecipes: ");
        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).recipeName().contains(recipe)) {
                System.out.println(
                        recipeList.get(i).recipeName() + "," + " cooking time: " + recipeList.get(i).cookingTime());
            }
        }
    }

    public void searchTime(int time) {
        System.out.println("\nRecipes: ");
        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).cookingTime() <= time) {
                System.out.println(
                        recipeList.get(i).recipeName() + "," + " cooking time: " + recipeList.get(i).cookingTime());
            }
        }
    }

    public void searchIngredient(String ingredient) {
        System.out.println("\nRecipes: ");
        for (int i = 0; i < recipeList.size(); i++) {
            if (recipeList.get(i).getIngredients().contains(ingredient)) {
                System.out.println(
                        recipeList.get(i).recipeName() + "," + " cooking time: " + recipeList.get(i).cookingTime());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
}
