class Customer
{

private String name;
private int address;
private int mobile;
public void setAddress(int address)
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
public int getAddress(){
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