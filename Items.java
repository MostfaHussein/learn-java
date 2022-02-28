
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String x = scanner.nextLine();
        while(!(x.equals(""))) {
            items.add(new Item(x));
            x= scanner.nextLine();
        }
        for(Item y : items) {
            System.out.println(y);
        }

    }
}
