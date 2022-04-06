
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which file should have it's content printed?");
            String fileName = scanner.nextLine();
            Scanner scanner2 = new Scanner(Paths.get(fileName));
            while(scanner2.hasNextLine()){
                String content = scanner2.nextLine();
                System.out.println(content);
            }
        }
        catch(Exception e){
            System.out.println("Exeception: "+e);
        }

    }
}
