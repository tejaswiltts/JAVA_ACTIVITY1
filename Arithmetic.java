import java.util.Scanner;
class Arithmetic
{
	public static void main(String [] args)	
{
	int a,b,n;
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	n=sc.nextInt();
	int k=Arithmetic_Operation(a,b,n);
	if(k==-1)
	{
	System.out.println("Invalid input");
	}
	else
	{
		System.out.println(k);
	}
}
	static int Arithmetic_Operation(int a,int b,int n)
	{
	int c=0; 
	if((a>=32767 || a<0) || (b>=32767 || b<0) || (a>4 || n<0))
	{
		c=-1;
	}
	else
	{
		switch(n)
		{
		case 1:
			c=a+b;
			
			break;
		case 2:
			c=a-b;
			
			break;
		case 3:
			c=a*b;
			
			break;
		case 4:
			c=a/b;
			break;
		}
		
	}
	return c;
	}
}
	