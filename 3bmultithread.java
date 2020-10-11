import java.util.Random; 
import java.util.Scanner; 

public class Mythread {
	public static void main(String[] args) throws InterruptedException 
	{
		Runnable r1 = new Runnable1();   
		Thread t1 = new Thread(r1); 
		t1.start(); 
		Thread.sleep(5000); 
	Runnable r2 = new Runnable2();   
	Thread t2 = new Thread(r2); 
	t2.start(); 
	Thread.sleep(5000); 
	Runnable r3 = new Runnable3();   
	Thread t3 = new Thread(r3); 
	t3.start(); 
	Thread.sleep(5000); 
	  }
}
class Runnable1 implements Runnable
{
	public void run()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number to find square");   
		int a=in.nextInt();
		int b=a*a; 
		System.out.println("The square of number is:"+b);
		}
	}
class Runnable2 implements Runnable
{
	public void run()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number to find cube"); 
		int c=in.nextInt();  
		int d=c*c*c;   
		System.out.println("The cube of number is:"+d);
		}
	}
class Runnable3 implements Runnable
{
	int n,i;  
	public void run() 
	{
		Scanner in=new Scanner(System.in);
		Random rand=new Random(); 
		n=rand.nextInt(50);  
		System.out.println("\nEnter the number of elements");
		n=in.nextInt();
		int arr[]=new int[n]; 
		for(i=0;i<n;i++)
			arr[i]=rand.nextInt(50);  
		System.out.println("\nthe random elements are ");  
		for(i=0;i<n;i++)   
			System.out.println(arr[i]+" "); 
}

}
