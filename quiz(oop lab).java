class Employee{

private  String firstname;
private  String lastname;
private  String socialsecuritynumber;



public Employee(String firstname , String lastname, String socialsecuritynumber ) 
{ this.firstname = firstname;
this.lastname = lastname;
this.socialsecuritynumber = socialsecuritynumber;

}

public String getFirstName()
{
return firstname;
}
public String getLastName()
{
return lastname;
}
public String getSocialSecurityNumber()
{
return socialsecuritynumber;
}

public String  toString()
{
return ("\n Comission Employee " +firstname+lastname+
"\n SocialSecurityNumber"+socialsecuritynumber);

}

}

class CommissionEmployee extends Employee{


private double grosssales;
private double comissionrate;


CommissionEmployee(String firstName,String lastName,String socialsecuritynumber, double grosssales, double comissionrate )
{

super(firstName,lastName,socialsecuritynumber);
  
this.grosssales = grosssales;
this.comissionrate = comissionrate;
}
public void setGrossSales(double grosssales)
{
this.grosssales = grosssales;
}
public double getGrossSales()
{
return grosssales;
}
public void setComissionRate(double commissionRate)
{
this.comissionrate = comissionrate;
}
public double getComissionRate()
{
return comissionrate;
}
public double earnings(){
return comissionrate * grosssales;
}
public String toString()
{
System.out.println(super.toString());
return ("\n Gross Sales " +grosssales+ 
"\n Comission rate "+comissionrate);
}


}


class TestComissionEmployes{


public static void main(String args[])
{



CommissionEmployee c1 = new CommissionEmployee("usama","sohail","992",3434,43434);
c1.earnings();
System.out.println(c1.toString());






}





}