import java.util.Scanner;

class Appointments{

public String description;
public String date;
public int year;
int[] day = new int[31];
public boolean appointment;
public int month;

public void start(){
if(appointment){
System.out.println("Your appointment has been booked....");
}
else
{
System.out.println("sorry appointment are closed now");
}
}


public void startappointment(){
appointment=true;


}

public void BookAppointment(){

Scanner s1 = new Scanner(System.in);
System.out.println("Enter appointment date");
date = s1.nextLine();

System.out.println("Enter appointment day in number");
day[0] = s1.nextInt();


System.out.println("Enter appointment month in number");
month = s1.nextInt();



System.out.println("Enter appointment year in number");
year = s1.nextInt();



System.out.println("Enter appointment description");
description = s1.nextLine();


}
}

class OneTime extends Appointments{





}



class Daily extends Appointments{






}


class monthly extends Appointments{

public void monthlyappointment(){
super.BookAppointment();


int i;

if ((month == 1) || (month == 3) || (month == 5)|| (month == 7)|| (month == 8) || (month == 10) || (month == 12)){ 


for(i=1;i==day[0];i++)
{

System.out.printf("%d is matched by the month ",day[i]);


}
}
}
}
class Test_Inheritance{
public static void main(String args[])
{



Appointments patient1 = new Appointments();
patient1.startappointment();
patient1.start();

monthly patient2 = new monthly();
patient2.monthlyappointment();

}}








