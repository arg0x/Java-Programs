import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Integer> markList;

    GradeManager() {
        this.markList = new ArrayList<>();
    }

    public void addMarks(String markString) {
        int marks = Integer.valueOf(markString);

        if (marks >= 0 && marks <= 100) {
            markList.add(marks);
        }

    }

    public double avgOfAll() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < markList.size(); i++) {
            sum = sum + markList.get(i);
            count++;
        }

        double avg = (double) sum / count;

        return avg;

    }

    public String avgOfPassing() {
        int sum = 0;
        int passCount = 0;

        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i) >= 50) {
                sum = sum + markList.get(i);
                passCount++;
            }
        }
        if (passCount != 0) {
            double avg = (double) sum / passCount;
            return String.valueOf(avg);
        } else {
            return "-";
        }

    }

    public double passPercentage() {
        int passCount = 0;
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i) >= 50) {
                passCount++;
            }
        }
        double passPercent = (double) 100 * passCount / markList.size();
        return passPercent;
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        int[] stars = new int[6];
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i) < 50) {
                stars[0]++;
            } else if (markList.get(i) < 60) {
                stars[1]++;
            } else if (markList.get(i) < 70) {
                stars[2]++;
            } else if (markList.get(i) < 80) {
                stars[3]++;
            } else if (markList.get(i) < 90) {
                stars[4]++;
            } else if (markList.get(i) >= 90) {
                stars[5]++;
            }

        }

        for (int i = stars.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
