import java.util.ArrayList;
import java.util.Scanner;
abstract class computer{
    String CompanyName;
    int Model;
    String ProcessorType;
    String color;
    int price;
    computer(String CompanyName,int Model,String ProcessorType,String color,int price){
        this.CompanyName =CompanyName;
        this.Model=Model;
        this.ProcessorType=ProcessorType;
        this.color=color;
        this.price=price;
    }
    
    abstract void DisplayData();
}

class desktopComputer extends computer{
    desktopComputer(){
        super("Dell",2019,"core i5","black",500);
    }
    void DisplayData(){
        System.out.println("CompanyName:"+CompanyName);
        System.out.println("Model:"+2019);
        System.out.println("Processor Type:"+ProcessorType);
        System.out.println("Color:"+color);
        System.out.println("Price:"+price);
    }
}
class laptopComputer extends computer{
    String camera;
    String size;
    double weight;
    laptopComputer(){
        super("Dell",2019,"core i5","black",500);
        this.camera="Canon";
        this.size="12*12";
        this.weight=15.9;
    }
    void DisplayData(){
        System.out.println("CompanyName:"+CompanyName);
        System.out.println("Model:"+2019);
        System.out.println("Processor Type:"+ProcessorType);
        System.out.println("Color:"+color);
        System.out.println("Price:"+price);
        System.out.println("Camera:"+camera);
        System.out.println("Size:"+size);
        System.out.println("Weight:"+weight);
    }
}
public class task3_4{
    public static void main(String[] args){
   ArrayList<String> myComputer = new ArrayList<String>();
System.out.println("Enter Type of computer like Dell or Hp");
Scanner input = new Scanner(System.in);
for(int i=1;i<=3;i++){
String name=input.nextLine();
myComputer.add(name);
}
for(int i=1;i<=3;i++){
System.out.println("Your "+i+" Computer ");
if(myComputer.contains("Dell")|| myComputer.contains("dell"))
{
desktopComputer Computer=new desktopComputer();
Computer.DisplayData();
myComputer.remove("cat");
  }
else if(myComputer.contains("Hp") || myComputer.contains("hp"))
{
laptopComputer computer2=new laptopComputer();
computer2.DisplayData();
myComputer.remove("Hp");
}

else{System.out.println("Not Present in our list");}
}

    }
}