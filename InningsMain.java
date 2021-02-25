import java.util.*;
class InningsMain
{
public static void main(String[] args){
InningsDetails i=new InningsDetails();
Scanner sc=new Scanner(System.in);
System.out.println("enter the teamname: ");
String teamname=sc.next();
i.setTeamname(teamname);
System.out.println("enter session:");
String inningsname= sc.next();
i.setInningsname(inningsname);
System.out.println("enter runs:");
int runs= sc.nextInt();


i.setMobile(mobile);
i.displayDetails();
i.displayInningsDetails(runs);
}
}