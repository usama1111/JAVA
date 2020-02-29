
import java.util.Scanner;
class BMI{




public static void main(String args[])

{

double height;
double weight;
double answer;
Scanner s1=new Scanner(System.in);
System.out.println("enter your weight");
weight=s1.nextDouble();
System.out.println("weight is " + weight); 

System.out.println("enter your height");
height=s1.nextDouble();
System.out.println("weight is " + height); 

answer=(height*height)/(weight);
System.out.println("your bmi is   " + answer);

if(answer < 18.5)
{
System.out.println("underweight");
}
if((answer >= 18.5)&&(answer < 25.0))
{
System.out.println("normal");
}
if((answer > 25.0)&&(answer < 30.0))
{
System.out.println("overweight");
}
if(answer >= 30.0)
{
System.out.println("obese");
}

}

}
