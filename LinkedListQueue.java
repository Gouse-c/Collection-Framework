import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) queue.offer(sc.nextLine());
        System.out.println("Queue: " + queue);
        if (!queue.isEmpty()) System.out.println("Removed: " + queue.poll());
        System.out.println("Front Element: " + (queue.isEmpty() ? "Queue is empty" : queue.peek()));
        System.out.println("Queue after poll: " + queue);
        sc.close();
    }
}
