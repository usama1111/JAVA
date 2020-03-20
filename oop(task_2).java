
class CustomerAccount{

private String CustomerName;
private String TypeOfAccount;
private String AccountNumber;
private String CurrentBalance;
private int debit;
private int credit;

public int getDebit(){
return debit;
}
public void setDebit(int newDebit)
{
this.debit=newDebit;
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
CustomerAccount c1 = new CustomerAccount();
CustomerAccount c2=new CustomerAccount();
CustomerAccount c3=new CustomerAccount();

c1.setCustomerName("James");
c1.setCredit(100);
c1.setDebit(100);


c2.setCustomerName("Jhonson");
c2.setCredit(200);
c2.setDebit(50);


c3.setCustomerName("usama");
c2.setCredit(1000);
c2.setDebit(550);
System.out.printf("credit is %d  \n",c1.getCredit());

System.out.printf("debit is :%d \n",c1.getDebit());
System.out.printf("Customer name is:%s \n",c1.getCustomerName());

System.out.printf("credit is %d \n",c2.getCredit());

System.out.printf("debit is :%d \n",c2.getDebit());
System.out.printf("Customer name is:%s \n",c2.getCustomerName());


System.out.printf("credit is %d \n",c3.getCredit());

System.out.printf("debit is %d \n",c3.getDebit());

}
}