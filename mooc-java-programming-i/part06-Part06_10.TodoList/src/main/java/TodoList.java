import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> task;

    public TodoList() {
        this.task = new ArrayList<>();
    }

    public void add(String task) {
        this.task.add(task);

    }

    public void remove(int number) {
        if (this.task.size() > 0) {
            this.task.remove(number - 1);
        }
    }

    public void print() {
        for (int i = 0; i < this.task.size(); i++) {
            System.out.println(i + 1 + ": " + this.task.get(i));
        }

    }

}
