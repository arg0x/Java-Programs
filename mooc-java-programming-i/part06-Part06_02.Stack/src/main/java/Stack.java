import java.util.ArrayList;

public class Stack {

    ArrayList<String> value;

    public Stack() {
        this.value = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.value.add(value);
    }

    public String take() {
        String last = this.value.get(value.size() - 1);
        this.value.remove(last);
        return last;
    }

    public ArrayList<String> values() {
        return value;
    }

}
