

import java.util.Scanner;
import java.util.Random; 
import java.util.ArrayList;
 class Myclass{
   static int pick;
public static void main(String[] args){

int n;
System.out.println("enter array size n");
Scanner s1 = new Scanner (System.in);
n = s1.nextInt();

 ArrayList<Integer> list1 = new ArrayList<>(n);
 ArrayList<Integer> list2 = new ArrayList<>(n);

Random rand = new Random();







        for (int j = 0; j<n; j++)
        {
        
            pick = rand.nextInt(2);
            list1.add(pick);
        }

        System.out.println("Contents of list1: " + list1);
     
for(int j=0;j<n;j++)
{
       for (int i = 0; i<n; i++)
        {
        
            pick = rand.nextInt(2);
            list2.add(pick);
        }

        System.out.printf("Contents of list2: " ,list2);
        
 }    
}
}

