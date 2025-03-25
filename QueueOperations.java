import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class QueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Print Queue");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to enqueue: ");
                    queue.add(sc.nextInt());
                    break;
                case 2:
                    if (!queue.isEmpty())
                        System.out.println("Dequeued: " + queue.poll());
                    else
                        System.out.println("Queue is empty.");
                    break;
                case 3:
                    if (!queue.isEmpty())
                        System.out.println("Front element: " + queue.peek());
                    else
                        System.out.println("Queue is empty.");
                    break;
                case 4:
                    System.out.println("Is empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Queue: " + queue);
                    break;
                case 6:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
