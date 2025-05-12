import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
class ReversingLinkedList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size of elements you need keep in List  : ");
		int size=sc.nextInt();
		sc.nextLine();;
		if(size<0){
			System.out.println("\nInvalid Size.!!");
			sc.close();
			return;
		}
		List<String>l=new LinkedList<String>();
		System.out.println("\nEnter the names : ");
		for(int i=0;i<size;++i){
			String name=sc.nextLine();
			l.add(name);
		}
		System.out.println("\nBefore Reversing : "+l);
		Collections.reverse(l);
		System.out.println("\nAfter Reversing : "+l);
		
	}
}