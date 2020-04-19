

import java.util.Scanner;
class Person{

public String name;
public int DateOfBirth;




public void Person(){
Scanner s1=new Scanner(System.in);
System.out.println("enter your name");
name = s1.nextLine();
System.out.println("enter your Date of birth");
DateOfBirth = s1.nextInt();

}
void display(){

System.out.printf("\n Name is %s and date of birth is %d",name,DateOfBirth);



}
}

class Student extends Person{


public String major;

Student(){
Scanner s1 = new Scanner(System.in);
super.Person();
System.out.println("Enter your major");
major = s1.nextLine();
super.display();
System.out.printf("\n major is %s",major);
}
}

class Instructor extends Person{


public int salary;

Instructor(){
Scanner s1 = new Scanner(System.in);
super.Person();
System.out.println("Enter your salary");
salary = s1.nextInt();

}

void salary(){
super.display();
System.out.printf("\n salary is %d \n",salary);



}
}


class TestInheritance{

public static void main(String args[]){



Instructor usama = new Instructor();
Student umer = new Student();


usama.display();
usama.salary();





}







}
