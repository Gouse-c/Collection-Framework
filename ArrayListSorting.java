import java.util.*; 
public class ArrayListSorting {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mountain");
        list.add("River");
        list.add("Forest");
        list.add("Ocean");
        list.add("Valley");
        System.out.println("Unsorted ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted ArrayList in Ascending order: " + list);
    }
}