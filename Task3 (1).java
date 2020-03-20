import java.util.Scanner;
import java.util.Random;
public class Main{public static void main(String[] args)
 {    int Number;     Scanner keyboard = new Scanner(System.in);     
               int guess;                    int counter = 0;while(true){            
Number = (int) (Math.random() *9+ 1);           
 System.out.println("Enter a number between 1 to 10");        
    System.out.print("Enter a guess: ");    
        guess = keyboard.nextInt();   
                                             if (guess == Number){                  
System.out.println("Your guess is correct. Congratulations!");}       
     else if (guess < Number){
                  System.out.println("Your guess is smaller than the secret number.");                
System.out.println("Secret number is " + Number);      
      }            else if (guess > Number){    
              System.out.println("Your guess is greater than the secret number.");                   
  System.out.println("Secret number is " + Number);                                              
       }            counter = counter + 1 ;         }}}