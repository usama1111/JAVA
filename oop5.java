import java.util.Scanner;

class AllProducts{

public String ProductName;
public int ProductId;


public void Product(){



Scanner s1 =new Scanner(System.in);

System.out.println("enter product name");
ProductName = s1.nextLine();

System.out.println("enter product Id");
ProductId = s1.nextInt();

System.out.printf("\n Product Name : %s \n Product Id : %d \n",ProductName,ProductId);

}
}

class UtilityProducts extends AllProducts{

public int discount;

public void Utility(){
System.out.println("\n welcome to utility products section");
Scanner s2 =new Scanner(System.in);

super.Product();
System.out.println("Please Enter price of product");
int price = s2.nextInt();
System.out.println("Please Enter discount");
discount = s2.nextInt();
discount = price - discount;
System.out.printf("\n Product Name : %s \n Product Id : %d \n Discounted Price j : %d \n",ProductName,ProductId,discount);


}
}

class foodProducts extends AllProducts{

public String DateOfExpiry;


public void food(String DateOfExpiry){

System.out.println("\nwelcome to Food produts section");

super.Product();

System.out.printf("\n Product Name : %s \n Product Id : %d \n Date Of Expiry : %s ",ProductName,ProductId,DateOfExpiry);

}
}

class Test_Inheritance{

public static void main(String[] args){



AllProducts p1 = new AllProducts();
foodProducts p2 = new foodProducts();
UtilityProducts p3= new UtilityProducts();



p1.Product();
p2.food("21-7-2020");
p3.Utility();






}








}