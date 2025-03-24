import java.util.Scanner;
import java.util.Stack;
class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Print Stack");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    if (!stack.isEmpty())
                        System.out.println("Popped: " + stack.pop());
                    else
                        System.out.println("Stack is empty.");
                    break;
                case 3:
                    if (!stack.isEmpty())
                        System.out.println("Top element: " + stack.peek());
                    else
                        System.out.println("Stack is empty.");
                    break;
                case 4:
                    System.out.println("Is empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack: " + stack);
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
