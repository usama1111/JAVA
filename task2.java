

class task2{
public static void main(String args[])
{

int loan=200000;
float pay;
int check=1;

float year1=loan * 0.23f;
float year3=year1*3;
System.out.println("after 1 years = " + year3);

while(true)
{
year1=year1+year1;
check++;

if(year1>=200000)
System.out.println("it will take"+check+"years");
break;
}


}



}


