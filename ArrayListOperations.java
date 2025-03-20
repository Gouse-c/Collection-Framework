import java.util.ArrayList;
import java.util.Scanner;
class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Element");
            System.out.println("2. Get Element");
            System.out.println("3. Update Element");
            System.out.println("4. Remove Element");
            System.out.println("5. Check if Element Exists");
            System.out.println("6. Get Size");
            System.out.println("7. Print All Elements");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    names.add(sc.nextLine().trim());
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < names.size()) 
                        System.out.println("Element: " + names.get(index));
                    else 
                        System.out.println("Invalid index");
                    break;
                case 3:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();
                    if (updateIndex >= 0 && updateIndex < names.size()) {
                        System.out.print("Enter new name: ");
                        names.set(updateIndex, sc.nextLine().trim());
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine().trim();
                    if (names.remove(removeName))
                        System.out.println(removeName + " removed.");
                    else
                        System.out.println("Name not found.");
                    break;
                case 5:
                    System.out.print("Enter name to check: ");
                    System.out.println("Exists? " + names.contains(sc.nextLine().trim()));
                    break;
                case 6:
                    System.out.println("Size: " + names.size());
                    break;
                case 7:
                    System.out.println("ArrayList: " + names);
                    break;
                case 8:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
