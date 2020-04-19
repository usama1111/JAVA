

import java.util.Scanner;
class Question{



public String flower;
public String answerOfQuestion1 = "jasmine";
public Double answer;
public Double answerOfQuestion2 = 3.428;

public void checkAnswer(){

if ((flower == answerOfQuestion1) || (flower == "JASMINE"))
{

System.out.println("Your answer 1 is correct!!");



}
else{
System.out.println("your answer 1 is wrong");
}
}
}

class MultipleChoiceQuestion extends Question{



void MultipleChoiceQuestion(){



System.out.println("Qustion : 1");
System.out.println("What is the natioanl flower of Pakistn??");
System.out.println("options \n 1 : rose \n 2 : lilly \n 3 : jasmine\n");

Scanner s1 = new Scanner(System.in);
flower = s1.nextLine();
}







}
class NumericQuestion extends Question{




void NumericQuestion(){

Scanner s2 = new Scanner(System.in);

System.out.println("question : 2");
System.out.println("12 / 3.5 = ????");
answer = s2.nextDouble();



if ((answer == answerOfQuestion2) || (answer == 3.418))

{

System.out.println("Your answer 2 is right");

}
else{
System.out.println("your answer 2 is wrong");
}
}
}



class TestInheritance{


public static void main(String args[]){



NumericQuestion player1 = new NumericQuestion();
MultipleChoiceQuestion player2 = new MultipleChoiceQuestion();
player2.MultipleChoiceQuestion();
player1.NumericQuestion();
player1.checkAnswer();



}




}