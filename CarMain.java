class CarMain
{
public static void main(String[] args){
Car c=new Car();
c.setNoOfWheels(4);
c.setName("benz");
System.out.println("car name:"+c.getName());
System.out.println("no of wheels:"+c.getNoOfWheels());
Vehicle v=new Vehicle();
v.setNoOfWheels(2);
//v.setName("bicycle");
System.out.println("no of wheels:"+v.getNoOfWheels());
Vehicle v1=new Car();
v1.setNoOfWheels(2);
v1.setName("bicycle");
 Car c1= new Vehicle();

}
}
