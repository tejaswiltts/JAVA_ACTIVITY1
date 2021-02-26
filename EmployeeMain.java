import java.util.*;
class EmployeeMain
{
public static void main(String[] args){
Employee e=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
String name=sc.next();
e.setName(name);
System.out.println("enter the address");
String address= sc.next();
e.setAddress(address);
System.out.println("enter the mobile");
int mobile= sc.nextInt();
if(mobile<0){
System.out.println("invalid");
}

e.setMobile(mobile);
e.displayEmployee();
}
  System.out.println("Employee Details");
System.out.println("Name : "+e.getName());
System.out.println("Adress : "+e.getAddress());
System.out.println("Mobile : "+e.getMobile());
}
