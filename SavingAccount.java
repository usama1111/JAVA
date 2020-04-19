class SavingAccount {

public static double annualInterestRate = 0.03;
public double savingBalance;

public void calculateMonthlyInterest(double savingBalance){


savingBalance = savingBalance + (savingBalance*annualInterestRate)/12;


}

public void printBalance(){

calculateMonthlyInterest();
System.out.printf("Saving is %.2f",savingBalance);
}

public static void modifyInterestRate(double annualInterestRate){

System.out.println("New annual interestrate has been modified");
}
}
class TestSavingAccount{

public static void main(String args[])
{



SavingAccount saver1 = new SavingAccount();
SavingAccount saver2 = new SavingAccount();

saver1.calculateMonthlyInterest(1.22);
saver2.calculateMonthlyInterest(100.99);

saver1.printBalance();
saver2.printBalance();


saver1.modifyInterestRate(0.04);

saver1.calculateMonthlyInterest(1.22);
saver1.printBalance();

saver2.calculateMonthlyInterest(100.99);
saver2.modifyInterestRate(0.04);
saver1.printBalance();
}




}