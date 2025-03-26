import java.util.LinkedList;
import java.util.Scanner;
class LinkedListStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements to push: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = sc.nextInt();
            stack.push(num);
        }

        System.out.println("Stack: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        } else {
            System.out.println("Stack is empty, nothing to pop.");
        }

        System.out.println("Stack after pop: " + stack); 
        sc.close();
    }
}
