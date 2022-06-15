import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeManager grade;

    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.grade = new GradeManager();

    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String intString = scanner.nextLine();
            grade.addMarks(intString);
            if (intString.equals("-1")) {
                break;
            }

        }

        System.out.println("Point average (all): " + grade.avgOfAll());
        System.out.println("Point average (passing): " + grade.avgOfPassing());
        System.out.println("Pass percentage: " + grade.passPercentage());
        grade.gradeDistribution();
    }
}
