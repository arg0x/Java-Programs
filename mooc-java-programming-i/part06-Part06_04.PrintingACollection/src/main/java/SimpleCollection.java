
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String list = "";
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";

        }
        for (String string : elements) {
            list = list + "\n" + string;
        }
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + list;

        }

        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + list;

    }

}
