
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int gameCount = 0;
        int homeWin = 0;
        int homeLoss = 0;
        int vistingWin = 0;
        int vistingLoss = 0;

        try {
            Scanner scanner = new Scanner(Paths.get(file));
            while (scanner.hasNext()) {
                String lines = scanner.nextLine();
                String[] array = lines.split(",");
                String homeTeam = array[0];
                String vistingTeam = array[1];
                String homePoints = array[2];
                String visitingPoints = array[3];

                if (homeTeam.equals(teamName) || vistingTeam.equals(teamName)) {
                    gameCount++;

                }

                if (homeTeam.equals(teamName)) {
                    if (Integer.valueOf(homePoints) > Integer.valueOf(visitingPoints)) {
                        homeWin++;
                    } else {
                        homeLoss++;
                    }
                }

                if (vistingTeam.equals(teamName)) {
                    if (Integer.valueOf(visitingPoints) > Integer.valueOf(homePoints)) {
                        vistingWin++;
                    } else {
                        vistingLoss++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        System.out.print("Games: ");
        System.out.println(gameCount);
        System.out.print("Wins: ");
        System.out.println(homeWin + vistingWin);
        System.out.print("Losses: ");
        System.out.println(homeLoss + vistingLoss);
    }

}
