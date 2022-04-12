
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment comapared) {

        if (this.rooms > comapared.rooms) {
            return true;
        }
        if (this.rooms < comapared.rooms) {
            return false;
        }

        if (this.squares > comapared.squares) {
            return true;
        }

        if (this.squares < comapared.squares) {
            return false;
        }

        if (this.pricePerSquare > comapared.pricePerSquare) {
            return true;
        }

        if (this.pricePerSquare < comapared.pricePerSquare) {
            return false;
        }

        return false;

    }

    public int priceDifference(Apartment compared) {

        return Math.abs((this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares));
    }

    public boolean moreExpensiveThan(Apartment compared) {

        int rate = this.squares * this.pricePerSquare;
        int rate2 = compared.squares * compared.pricePerSquare;
        if (rate > rate2) {
            return true;
        }

        return false;
    }

}
