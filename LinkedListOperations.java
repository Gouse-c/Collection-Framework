import java.util.LinkedList;
import java.util.Scanner;
class LinkedListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Add Element");
            System.out.println("2. Add Element at Index");
            System.out.println("3. Remove Element");
            System.out.println("4. Get Element");
            System.out.println("5. Update Element");
            System.out.println("6. Check if Element Exists");
            System.out.println("7. Get Size");
            System.out.println("8. Print All Elements");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    list.add(sc.nextLine().trim());
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index <= list.size()) {
                        System.out.print("Enter element to insert: ");
                        list.add(index, sc.nextLine().trim());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter element to remove: ");
                    if (list.remove(sc.nextLine().trim()))
                        System.out.println("Element removed.");
                    else
                        System.out.println("Element not found.");
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    if (index >= 0 && index < list.size()) 
                        System.out.println("Element: " + list.get(index));
                    else 
                        System.out.println("Invalid index.");
                    break;
                case 5:
                    System.out.print("Enter index to update: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index < list.size()) {
                        System.out.print("Enter new element: ");
                        list.set(index, sc.nextLine().trim());
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 6:
                    System.out.print("Enter element to check: ");
                    System.out.println("Exists? " + list.contains(sc.nextLine().trim()));
                    break;
                case 7:
                    System.out.println("Size: " + list.size());
                    break;
                case 8:
                    System.out.println("LinkedList: " + list);
                    break;
                case 9:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
