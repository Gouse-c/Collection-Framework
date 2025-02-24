import java.util.Scanner;
import java.util.ArrayList;
class StringArrayListExample1{
          public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    ArrayList<String> friends = new ArrayList<String>();
                    System.out.print("Enter the size of the Array_List :  ");
                    int n=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<n;i++){
                              System.out.print("Enter the  name " + (i+1) + " : ");
                              String name=sc.nextLine();
                              friends.add(name);
                    }
                    System.out.print(" "+ friends);
          }
}          
                              