
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        try {
            Scanner scanner2 = new Scanner(Paths.get(file));
            while(scanner2.hasNextLine()){
                int num = Integer.valueOf(scanner2.nextLine());
                for(int i=lowerBound; i<=upperBound; i++){
                    if(num==i){
                        count++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        System.out.println("Numbers: "+count);

    }

}
