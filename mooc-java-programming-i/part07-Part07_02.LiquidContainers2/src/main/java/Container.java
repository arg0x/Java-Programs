public class Container {

    private int container;

    public Container() {

    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount > 0) {
            container = container + amount;
        }

        if (container >= 100) {
            container = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            container = container - amount;
        }

        if (container < 0) {
            container = 0;
        }
    }

    public String toString() {
        return container + "/100";
    }

}