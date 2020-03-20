import java.util.Scanner;
import java.util.Random;
public class Main{public static void main(String[] args) {  
         int comp_dice;  
      int comp_user;
        int compadd = 0;
        int useradd = 0; 
       int counterofcomputer=0;   
     int counterofuser =0; 
       for (int i = 1 ; i<=10 ; i++){      
      comp_dise = (int) (Math.random()*5+ 1);  
          compadd +=comp_dice;            
com_user = (int) (Math.random()*5+ 1);       
     useradd +=comp_user;            if(comp_user == comp_dice)         
   {                System.out.println("Tie");              
  break;            }     
       else if(comp_user > comp_dice)            
{                System.out.println("User wins");     
           counterofuser = counterofuser + 1;            }            else
            {                System.out.println("Computer wins");                counterofcomputer = counterofcomputer +1;            }     
   }        System.out.println("Total rank of computer:  "+comadd);        System.out.println("Total rank of user:  "+useradd);       
 System.out.println("\t\tComputer wins "+(counterofcomputer)+" Times");        System.out.println("\t\tUser wins "+(counterofuser)+" Times");        
if(counterofcomputer > counterofuser)        {            System.out.println("Computer Wins Finally");        }       
 else        {            System.out.println("User Wins Finally");        }}}