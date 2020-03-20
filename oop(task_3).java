
import java.util.Scanner;


class CustomerAccount{

private String CustomerName;
private String TypeOfAccount;
private int AccountNumber;
private String CurrentBalance;
private int debit;
private int credit;
public int number;
public int getDebit(){
return debit;
}
public void setDebit(int newDebit)
{
this.debit=newDebit;
}
public int getAccountNumber(){

return AccountNumber; 
}

public void setAccountNumber(int newAccountNumber)
{
this.AccountNumber=newAccountNumber;
}

public int getCredit(){

return debit;
}

public void setCredit(int newCredit)
{
this.credit=newCredit;

}
public String getCustomerName(){

return CustomerName;
}

public void setCustomerName(String newCustomerName)
{


this.CustomerName = newCustomerName;

}



public static void main(String[] args) {



Scanner s=new Scanner(System.in);
System.out.println("enter account number");
int a =s.nextInt();

CustomerAccount c1 = new CustomerAccount();
CustomerAccount c2=new CustomerAccount();
CustomerAccount c3=new CustomerAccount();





c1.setCustomerName("James");
c1.setCredit(100);
c1.setDebit(100);
c1.setAccountNumber(1);

c2.setCustomerName("Jhonson");
c2.setCredit(200);
c2.setDebit(50);
c2.setAccountNumber(2);

c3.setCustomerName("usama");
c3.setCredit(1000);
c3.setDebit(550);
c3.setAccountNumber(3);




switch(a)
{
case 1:


System.out.printf("credit is %d  \n",c1.getCredit());

System.out.printf("debit is :%d \n",c1.getDebit());
System.out.printf("Customer name is:%s \n",c1.getCustomerName());
break;

case 2:

System.out.printf("Customer name is:%s \n",c2.getCustomerName());
System.out.printf("credit is %d \n",c2.getCredit());

System.out.printf("debit is :%d \n",c2.getDebit());

break;

case 3:



System.out.printf("Customer name is:%s \n",c3.getCustomerName());
System.out.printf("credit is %d \n",c3.getCredit());

System.out.printf("debit is %d \n",c3.getDebit());
break;

default:
System.out.println("iNVALID ACCOUNT");
}
System.out.println("enter 1 for balance check \n enter 2 for withdraw \n enter 3 for deposit");

int b=s.nextInt();
System.out.println("enter amount to perform");
int amount =s.nextInt();




}
}