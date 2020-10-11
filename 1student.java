
import java.util.*; 
public class Student {
	String usn;  
	String name;  
	String branch;  
	long phone;  
	void getDetails()  
	{   
		Scanner in = new Scanner(System.in);     
		System.out.println("Enter the Student USN"); 
		usn=in.nextLine();  
		System.out.println("Enter the Student Name");
		name=in.nextLine();
		System.out.println("Enter the Student Branch");
		branch=in.nextLine(); 
		System.out.println("Enter the Student phone"); 
		phone=in.nextLong();
		}
	void putDetails()
	{
		System.out.println("\n\t USN:"+ usn + "\n \t Name:"+ name +"\n \t Branch:"+ branch + "\n \t Phone:"+phone ); 
		System.out.println("\n");
		}
	public static void main(String args[])
		{
			int i,n;  
			System.out.println("Enter the number of students"); 
			Scanner in=new Scanner(System.in);
			n=in.nextInt();
			Student a[]=new Student[n];
			for(i=0;i<n;i++)
				a[i]=new Student(); 
			for(i=0;i<n;i++)
			{
				System.out.println("\nEnter details of Student" +(i+1));  
				a[i].getDetails();
				}
			for(i=0;i<n;i++) 
			{
				System.out.println("\nThe details of  Student" +(i+1));
				a[i].putDetails();   
				} 
	}
}



