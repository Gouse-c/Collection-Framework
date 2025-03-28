import java.util.LinkedList;
import java.util.HashSet;
import java.util.Scanner;
class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        System.out.println("Original List: " + list);
        list = new LinkedList<>(new HashSet<>(list));
        System.out.println("List after removing duplicates: " + list);
        sc.close();
    }
}
