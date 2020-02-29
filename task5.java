
import java.util.Scanner;
class task5{
public static void main(String args[])
{
int number1;
int number2;
int number3;


Scanner s1 = new Scanner(System.in);
System.out.println("enter a number 1");
number1=s1.nextInt();

System.out.println("enter a number 2");
number2=s1.nextInt();

System.out.println("enter a number 3");
number3=s1.nextInt();

if((number1>number2)&&(number1>number3))
{
System.out.println("number 1 is greatest");
}
if((number2>number1)&&(number2>number3))
{
System.out.println("number 2 is greatest");
}
if((number3>number2)&&(number3>number1))
{
System.out.println("number 3 is greatest");
}
}



}
