import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int checkMax = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (checkMax + suitcase.totalWeight() <= maxWeight) {
            checkMax = checkMax + suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + checkMax + " kg)";
    }
}
