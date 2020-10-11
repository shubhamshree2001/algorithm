import java.util.Scanner;
public class Stack {
	final int max=100;
	int s[]=new int[max];
	int top=-1;
	void push(int ele)
	{
		if(top>max-1)
			System.out.println("stack overflow");
		else
			s[++top]=ele;
	}
	int pop()
	{
		int z=0;
		if(top==-1)
			System.out.println("syack underflow");
		else
			z=s[top--];
		return z;
	}
	void display()
	{
		if(top==-1)
			System.out.println("stack empty");
		else
			for(int i=top;i>-1;i--)
				System.out.println(s[i]+" ");
	}
	public static void main(String args[])
	{
		int q=1;
		Stack m = new Stack();
		System.out.println("program to perform stack operation");
		Scanner sc=new Scanner(System.in);
		while(q!=0) 
		{
			System.out.println("enter 1.push2.pop 3.display");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			int popele;
			switch(ch)
			{
			case 1:System.out.println("enter the element to be pushed");
			int ele=sc.nextInt();
			m.push(ele);
			break;
			case 2:popele=m.pop();
			System.out.println("the poped element is");
			System.out.println(popele+" ");
			break;
			case 3:System.out.println("element in the stack are");
			m.display();
			break;
			case 4:System.out.println("invalid choice");
			}
		}
	}
}
