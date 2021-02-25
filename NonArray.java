import java.util.*;
class NonArray
{
public static void main(String[]ar)
{
Scanner sc=new Scanner(System.in);
System.out.println("numbers");
int n=sc.nextInt();
int []a=new int[n];
int []b={1,2,3,4,5};
for(int i=0;i<n;i++)
{
System.out.println("enter the value of "+i+" : ");
a[i]=sc.nextInt();
}
System.out.println("the values are ");
for(int j:a)
{
System.out.println(j);
}
}
}