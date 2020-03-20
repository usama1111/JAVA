

class mobile{
String name;
String colour;
String model;
String battery_timing;

void display(){
System.out.println("company name is :"+name);
System.out.println("mobile model:"+model);
System.out.println("mobile colour:"+colour);
System.out.println("battery timing:"+battery_timing);



}

public static void main(String args[])
{

mobile motorolla=new mobile();

mobile samsung=new mobile();

mobile nokia=new mobile();

motorolla.name="motorolla";
motorolla.colour="grey";
motorolla.model="md-70";
motorolla.battery_timing="700Mah";

nokia.name="nokia";
nokia.colour="blue";
nokia.model="md-90";
nokia.battery_timing="1000Mah";

samsung.name="samsung";
samsung.colour="yellow";
samsung.model="nk-70";
samsung.battery_timing="200Mah";

motorolla.display();
nokia.display();
samsung.display();



}




}