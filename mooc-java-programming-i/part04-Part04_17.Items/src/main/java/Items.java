
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Item item = new Item("Hammer");
        // items.add(item);

        while(true){
            System.out.print("Name: ");
            String string = scanner.nextLine();

            if(string.equals("")){
                break;
            }
            items.add(new Item(string));

        }

        for(Item i : items){
            System.out.println(i);
        }


    }
}
