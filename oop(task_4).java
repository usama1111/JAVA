
class PSLteams{

private String teamName;
private int NoOfmatchesPlayed;
private int NoOfmatchesWon;
private int NoOfmatchesLost;
private int NoOfmatchesPlayed;
private int Rank;
private int status;

PSLteams(String teamName, int NoOfmatchesPlayed,int NoOfmatchesWon,int NoOfMatchesLost){
this.teamName= team;
this.NoOfMatchesPlayed= played;
this.NoOfMatchesWon= Won;
this.NoOfMatchesLost= Lost;
this.Rank=rank;
this.status=status;
}

 void PslMatch(int status){
System.out.println("team has"+status+"the match");

}
public void PointsTable(){

System.out.println("Team name : "+ team);
int count = played;
System.out.printf("Team has played %d matches",count++);

int count1 = Lost;
int i;
for(i=1;i>=count;i++)
{
if(status == 0)
{
System.out.printf("team has lost %d",count1++);
}
else{
System.out.printf("team has lost 0 matches");
}
}
 
int count2 = Won;

for(i=1;i >= count;i++)
{
if(status == 1)
{
System.out.printf("team has won %d",count2++);
}
else{
System.out.printf("team has won 0 matches");
}
}


}
}


class TestPSL2019{

public static void main(String[] args)
{


PSLteams KarachiKings=new PSLteams("karachiKings",1,1,0,1);
KarachiKings.PointsTable();



}




}