import java.util.ArrayList;
import java.util.Scanner;

public class Lab_11_Listmaker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean quit = false;

        while (!quit) {
            displayMenuAndList(list);
            String choice = SafeInput.getRegExString(in, "Enter your choice", "[AaDdIiPpQq]").toUpperCase();

            switch (choice) {
                case "A":
                    addItem(list, in);
                    break;
                case "D":
                    deleteItem(list, in);
                    break;
                case "I":
                    insertItem(list, in);
                    break;
                case "P":
                    printList(list);
                    break;
                case "Q":
                    quit = SafeInput.getYNConfirm(in, "Are you sure you want to quit?");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenuAndList(ArrayList<String> list) {
        System.out.println("\nMenu:");
        System.out.println("A - Add an item");
        System.out.println("D - Delete an item");
        System.out.println("I - Insert an item");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");

        System.out.println("\nCurrent List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }

    private static void addItem(ArrayList<String> list, Scanner in) {
        String item = SafeInput.getNonZeroLenString(in, "Enter the item to add");
        list.add(item);
        System.out.println("Item added to the list.");
    }

    private static void deleteItem(ArrayList<String> list, Scanner in) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        int index = SafeInput.getRangedInt(in, "Enter the item number to delete", 1, list.size()) - 1;

        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Item deleted from the list.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    private static void insertItem(ArrayList<String> list, Scanner in) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        int index = SafeInput.getRangedInt(in, "Enter the item number to insert before", 1, list.size() + 1) - 1;
        String item = SafeInput.getNonZeroLenString(in, "Enter the item to insert");

        if (index >= 0 && index <= list.size()) {
            list.add(index, item);
            System.out.println("Item inserted into the list.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    private static void printList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("\nList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }
}
