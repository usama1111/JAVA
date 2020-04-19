

import java.util.Scanner;

class Company{

private int Id;
public String Name;
public String DateOfBirth;
Public String Designation;
Public int Salary;


public Id(){

this.Id = Id++;
}

public void display(){
Scanner s1 = new Scanner(System.in);
System.out.printf("\n Your Id is \n is %d",this.Id);
System.out.println("\nEnter Your Name \n");
Name = s1.nextLine();
System.out.println("\nEnter your id\n");
Id = s1.nextInt();
System.out.println("\nEnter your Date of birth \n");
DateOfBirth = s1.nextLine();
System.out.println("\nEnter your designation \n");
Designation = s1.nextLine();
System.out.println("\nEnter your salary\n");
Salary = s1.nextInt();

System.out.printf("%s is performing data collection");

}


public static void main(String args[])
{
Company employe =new Company();

Company cat =new Company();


employe.display();

}



}