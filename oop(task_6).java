package retailitem;


public class RetailItem {

   private String description;
 
  private int UnitsOnHand;

   private double Price;  
 
      
      RetailItem (String description,int UnitsOnHand,double Price)

     {
        this.description = description;
        this.UnitsOnHand = UnitsOnHand;
       
 this.Price  = Price;
    }
 
   public void display()
{

  System.out.println("About product: "+description);
  System.out.println("The units on hand are: "+UnitsOnHand);

  System.out.println("The price of the item is : "+Price);
}
      
    
   public static void main(String[] args) {
      
  
        RetailItem ri1 = new RetailItem("Made in China",34,5999.95);
       
  RetailItem ri2 = new RetailItem("Made in Turkey",50,3432.95);
     
   ri1.display();
        ri2.display();
        
}       
       
}
 
////////////////////////////2nd part of the question///////////////////////////
package retailitem;


public class RetailItem {

  
 private String description;
   private int UnitsOnHand;
    double Price;   
      
     
  
  public void display()
{
  System.out.println("About product: "+description);
  
System.out.println("The units on hand are: "+UnitsOnHand);
  
System.out.println("The price of the item is : "+Price);
}
      
    
   public static void main(String[] args) {
        
    
    RetailItem Item1 = new RetailItem();
        
 RetailItem Item2 = new RetailItem();
        RetailItem Item3 = new RetailItem();
        Item1.description ="Jacket";
        Item1.UnitsOnHand = 12;
        Item1.Price =5999.95;
        Item2.description ="Designer jeans";
        Item2.UnitsOnHand = 40;
        Item2.Price = 3432.95;
        Item3.description ="Shirt";
        Item3.UnitsOnHand = 20;
        Item3.Price = 2494.95;
        
        Item1.display();
        Item2.display();
        Item3.display();
}       
       
}