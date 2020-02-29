import java.util.Scanner;
class BMI{
String name;
int id;

void sleep(){
System.out.println(name + "is sleeping");
}

void read(){

System.out.println(name + " is reading books in libarary ");
}


public static void main(String[] args)

{
BMI s1=new BMI();
BMI s2=new BMI();
s1.name="usama";
s1.id=1;

Scanner in = new Scanner(System.in);
System.out.println("enter your name ");
s2.name = in.nextLine();

System.out.println("name is " + s1.name);
System.out.println("id is " + s1.id);
s1.sleep();
s2.sleep();
s2.read();
}
}