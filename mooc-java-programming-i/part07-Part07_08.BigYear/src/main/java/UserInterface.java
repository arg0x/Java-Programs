import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.birdList = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                addBird();
            } else if (command.equals("Observation")) {
                noteObservation();
            } else if (command.equals("All")) {
                printBirdList();
            } else if (command.equals("One")) {
                oneBird();
            } else if (command.equals("Quit")) {
                break;
            }
        }
        scanner.close();
    }

    public void addBird() {
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String birdNameInLatin = scanner.nextLine();
        birdList.add(new Bird(birdName, birdNameInLatin));
    }

    public void noteObservation() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < birdList.size(); i++) {
            if (birdList.get(i).getBirdName().equals(birdName)) {
                birdList.get(i).addObervation();
                found = true;

            }
        }

        if (!found) {
            System.out.println("Not a Bird!");
        }
    }

    public void oneBird() {
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();
        for (Bird bird : birdList) {
            if (bird.getBirdName().equals(birdName)) {
                System.out.println(bird);
            }
        }
    }

    public void printBirdList() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

}
