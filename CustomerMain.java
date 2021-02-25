import java.util.*;
class CustomerMain
{
public static void main(String[] args){
Customer c=new Customer();
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
String name=sc.next();
c.setName(name);
System.out.println("enter the address");
int address= sc.nextInt();
c.setAddress(address);
System.out.println("enter the mobile");
int mobile= sc.nextInt();

c.setMobile(mobile);




c.displayCustomer();
}
}
