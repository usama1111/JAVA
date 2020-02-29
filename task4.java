
import java.util.Scanner;
class task4{
public static void main(String args[])
{

int number;
int ans;
int count;
Scanner s1 = new Scanner(System.in);
System.out.println("enter a number");
number=s1.nextInt();

do{
ans=number*number*number;
System.out.println("the cube of" + number + "is"+ans);

number--;
}
while(number != 0);
}

}

