import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();
            //part A
            boolean quit = false;
            while (!quit) {
                System.out.println("\nMenu:");
                System.out.println("A - Add an item");
                System.out.println("D - Delete an item");
                System.out.println("I - Insert an item");
                System.out.println("P - Print the list");
                System.out.println("Q - Quit");

                String choice = SafeInput.getNonZeroLenString(in, "Enter your choice").toUpperCase();

                switch (choice) {
                    case "A":
                        addItem(list, in);
                        break;
                    case "D":
                        deleteItem(list, in);
                        break;
                    case "I": insertItem(list, in);
                        break;
                    case "P": printList(list);
                        break;
                    case "Q": quit = SafeInput.getYNConfirm(in, "Are you sure you want to quit?");
                        break;
                    default:
                            System.out.println("Invalid choice. Please try again."
            }
        }
    }
    private void static addItem(String[] args) {
        ArrayList<String> item= new ArrayList<String>();
        String item =SafeInput.getNonZeroLenString(in,"Enter the item");
        item.add("New item");
        String var = item.get()-1);
        System.out.println("Item added:");
    }

    }

}