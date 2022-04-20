import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int checkMax = 0;

    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {

        if (checkMax + item.getWeight() <= maxWeight) {
            checkMax = checkMax + item.getWeight();
            this.items.add(item);
        }
    }

    public String toString() {

        if (this.items.isEmpty()) {
            return "no items (" + checkMax + " kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + checkMax + " kg)";

        } else {
            return this.items.size() + " items " + "(" + checkMax + " kg)";
        }

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return checkMax;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item i : items) {
            if (heaviest.getWeight() < i.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }

}
