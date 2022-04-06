
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        try {
            Scanner scanner2 = new Scanner(Paths.get(file));
            while(scanner2.hasNext()) {
                String line = scanner2.nextLine();
                String[] array = line.split(",");
                String name = array[0];
                String age = array[1];
                if(Integer.valueOf(age) > 1 || Integer.valueOf(age) == 0){
                    System.out.println(name+", age: "+age+" years");
                }else{
                    System.out.println(name+", age: "+age+" year");

                }

            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
