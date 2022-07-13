import java.util.ArrayList;

public class Recipes {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipes(String recipeName, int cookingTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String recipeName() {
        return recipeName;
    }

    public int cookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

}
