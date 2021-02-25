class Employee1
{

private String name;
private String address;
private int mobile;
public void setAddress(String address)
{
this.address=address;
}

public void setName(String name)
{
this.name=name;
}
public void setMobile(int mobile)
{
this.mobile=mobile;
}

public String getName(){
return name;
}
public String getAddress(){
return address;
}
public int getMobile(){
return mobile;
}


public void displayCustomer(){

System.out.println("name:"+name);
System.out.println("address:"+address);
System.out.println("mobile:"+mobile);
}
}