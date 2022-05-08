import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        String output = "";

        if (this.jokes.isEmpty()) {
            output = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            output = jokes.get(index);
        }

        return output;
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

}
