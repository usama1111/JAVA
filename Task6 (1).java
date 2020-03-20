import java.util.Scanner;
public class Main{public static void main(String[] args)
 {    Scanner obj = new Scanner(System.in); 
   System.out.println("Enter your Sentence :  ");  
        String sent = obj.nextLine();
          int length = sent.length();   
        char a;
          for (int i = 0; i< length ; i++) 
         {              char character = sent.charAt(i);   
           if(Character.isUpperCase(character) || sent.lastIndexOf('\\')=='.')   
           {                  System.out.println("The sentence is now beautify"); 
                 break;
              }              else if(Character.isLowerCase(character) || sent.lastIndexOf('\\')!='.')            
  {                  a =Character.toUpperCase(character);                  
System.out.println(""+a+""+sent.substring(1)+".");  
                break;            }          }}}