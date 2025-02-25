import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class ReverseArrayList{
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ArrayList<Integer> list = new ArrayList<>();
                    System.out.print("Enter the number of elements: ");
                    int n = sc.nextInt();
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++){
                              list.add(sc.nextInt());
                    }
                    System.out.println("Original List: " + list);
                    Collections.reverse(list);
                    System.out.println("Reversed List: " + list);
                    sc.close();
          }
}
