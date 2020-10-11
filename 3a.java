import java.util.Random;
import java.util.Scanner; 

public class classTest {
	public static void main(String[] args) 
	{
		int a,b,d;  
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of a"); 
		a=in.nextInt();
		System.out.println("Enter the value of b");
		b=in.nextInt();
		try 
		{
			d=a/b;
			System.out.println("\nThe Result of "+a+"/"+b+ " is:"+d);    
			}
		catch(ArithmeticException ae)
		{
			System.out.println("division by zero");  
			}
	}
}


