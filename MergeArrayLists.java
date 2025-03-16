import java.util.ArrayList;
import java.util.Scanner;
class MergeArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
		
        System.out.print("Enter the number of elements in the first list: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements for the first list:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextLine());
        }

        System.out.print("Enter the number of elements in the second list: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements for the second list:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextLine());
        }
        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
		
        sc.close();
    }
}
