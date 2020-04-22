import java.util.Scanner;
import java.util.*;
abstract class Animal
{
String nameOfFood;
String LivesIn;
Animal(String nameOfFood, String LivesIn)
{
this.nameOfFood=nameOfFood;
this.LivesIn=LivesIn;
}
abstract public void eat();
abstract public void makeNoise();
abstract public void sleep();
abstract public void move();
}
class  Dog extends Animal
{
Dog()
{
super("Dog Food","DifferentPlaces");
}
public void eat()
{
System.out.println("This Eats: "+nameOfFood);
}
public void makeNoise()
{
System.out.println("Its Barks ");
}
public void sleep()
{
System.out.println("And Sleeps less ");
}
public void move()
{
System.out.println("And MOve and lives in: "+LivesIn);
}
}

class  cat extends Animal
{
cat()
{
super("cat Food","at Homes");
}
public void eat()
{
System.out.println("This Eats: "+nameOfFood);
}
public void makeNoise()
{
System.out.println("Makes noice like Meeoowwww ");
}
public void sleep()
{
System.out.println("And Sleep more than other animals");
}
public void move()
{
System.out.println("And Moves and lives in: "+LivesIn);
}
}
class peagon extends Animal{
    peagon()
{
super("peagon Food","at Homes");
}
public void eat()
{
System.out.println("This Eats: "+nameOfFood);
}
public void makeNoise()
{
System.out.println("Makes noice like gogogogogo ");
}
public void sleep()
{
System.out.println("And Sleep more than other animals");
}
public void move()
{
System.out.println("And Moves and lives in: "+LivesIn);
}
}




public class task3_3
{
public static void main(String[] arg)
{
ArrayList<String> myAnimals = new ArrayList<String>();
System.out.println("Enter 2 Animal Type like cat or Dog");
Scanner input = new Scanner(System.in);
for(int i=1;i<=3;i++){
String name=input.nextLine();
myAnimals.add(name);
}
for(int i=1;i<=3;i++){
System.out.println("Your "+i+" Animal ");
if(myAnimals.contains("cat"))
{
cat Cat=new cat();
Cat.eat();
Cat.makeNoise();
Cat.sleep();
Cat.move();
myAnimals.remove("cat");
  }
else if(myAnimals.contains("dog"))
{
Dog dog=new Dog();
dog.eat();
dog.makeNoise();
dog.sleep();
dog.move();
myAnimals.remove("dog");
}
else if(myAnimals.contains("peagon"))
{
peagon pea=new peagon();
pea.eat();
pea.makeNoise();
pea.sleep();
pea.move();
myAnimals.remove("peagon");
  }
else{System.out.println("Not Present in our list");}
}

}

}