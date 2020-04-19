import java.util.Scanner;

class character{

public String name;

public void display_character(){
Scanner s1 = new Scanner(System.in);
System.out.println("enter character name");
name = s1.nextLine();
System.out.printf("\n %s can move\n",name);
System.out.printf("\n %s can speak\n",name);

}
}

class Germs extends character{

public String disease;


public void GermsDisease(String disease){

super.display_character();
System.out.printf("\n %s has a %s disease \n",name,disease);
System.out.printf("\n %s can spread this disease \n ",name);
}
}




class SpecialGerms extends Germs{



public void flyingGerms(){

super.display_character();
System.out.printf("\n %s is a special germ and it can fly\n",name);

}
} 

class Human extends character{




public void washHands(){

super.display_character();
System.out.printf("\n %s is a human and he is wahing his hands\n",name);

}
}



class Protector extends Human{


public void Protector(){


System.out.println("\n Commander safeguard is the protector \n");
System.out.println("Commander safeguard has a team of special kids and doctors");
}
}


class Test_Inheritance{

public static void main(String args[]){




character dirto = new character();
Germs satchi = new Germs();
Human human1 = new Human();
SpecialGerms ghumsunna = new SpecialGerms();
Protector SafeGuard = new Protector();

dirto.display_character();
satchi.GermsDisease("malaria");
human1.washHands();
ghumsunna.flyingGerms();
SafeGuard.Protector();

}





}








