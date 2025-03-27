import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        System.out.println("Original List: " + list);
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
        sc.close();
    }
}
