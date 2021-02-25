class DemoStrings1
{
public static void main(String[]ar)
{
String s1="hello"; //string literal
String s2="hello";
String s3=new String("hello"); //string obj and its value
String s4=new String("hello"); 
System.out.println("Length of hello "+s1.length());
System.out.println("Equal opr for literals "+(s1==s2));
System.out.println("Equal opr for obj and its value "+(s3==s4));
System.out.println("Check the content-literals "+s1.equals(s2));
System.out.println("Check the content-object "+s3.equals(s4));
System.out.println("Cross check"+s3.equals(s2));
System.out.println("concat "+s1.concat(s2));
System.out.println("value of s1:"+s1);
System.out.println("value of s2:"+s2);

}
}