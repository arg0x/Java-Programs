import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gift;

    public Package() {
        this.gift = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gift.add(gift);
    }

    public int totalWeight() {
        int sum = 0;
        for (Gift i : gift) {
            sum = sum + i.getWeight();
        }

        return sum;
    }
}
