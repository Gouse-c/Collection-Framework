import java.util.ArrayList;
import java.util.Scanner;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();

        System.out.print("Enter the number of colors: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " colors:");
        for (int i = 0; i < n; i++) {
            colors.add(sc.nextLine());
        }

        String[] colorArray = colors.toArray(new String[0]);

        System.out.println("\nColors in the array:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        sc.close();
    }
}
