class InningsDetails
{

private String teamname;
private String inningsname;
private int runs;
public void setTeamname(String teamname)
{
this.teamname=teamname;
}

public void setInningsname(String inningsname)
{
this.inningsname=inningsname;
}
public void setRuns(int runs)
{
this.runs=runs;
}

public String getTeamname(){
return teamname;
}
public String getInningsname(){
return Innings;
}
public int getRuns(){
return runs;
}

displayInningsDetails(int runs) 
{
int runNeed=runs+1;
System.out.println(+runNeed"to win");
}
public void displayDetails(){

System.out.println("Teamname"+teamname);
System.out.println("Inningsname:"+inningsname);
System.out.println("Runs:"+runs);
}
}