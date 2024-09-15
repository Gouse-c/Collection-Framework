import java.io.*;
class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	void displayData(){
		System.out.println(id+"\t"+ name);
	}
}
 class  StoringGroupOfObjectsInArray{
	public static void main(String args[]){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Employee a[]=new Employee[5];
		try{
			for(int i=0;i<5;i++){
				System.out.println("Enter the id number:");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter the Employee Name:");
				String name=br.readLine();
				a[i]=new Employee(id,name);
			}
			System.out.println("The Employee Data is : ");
			for(int i=0;i<a.length;i++){
				a[i].displayData();
			}
		}catch(IOException ie){
			System.out.println("Input Error is found...");
		}
	}
}
