import java.util.Scanner;
public class Airthmatic{
static int f;
static int s;
static int operational;
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter first number: ");
f=sc.nextInt();
System.out.println("enter second number: ");
s=sc.nextInt();
System.out.println("enter 1 for addition: ");
System.out.println("enter 2 for substraction: ");
System.out.println("enter 3 for multiplication: ");
System.out.println("enter 4 for division: ");
System.out.println("enter the operation:");
operational=sc.nextInt();
performAirthmaticoperation(f,s,operational);
}
static void performAirthmaticoperation(int f,int s,int operational);
{

