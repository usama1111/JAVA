/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.*;
/**
 *
 * @author fa19-bsse-0061
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
 int[][] arr = new int[3][3];  
    
 Scanner s1 = new Scanner(System.in);
 
 System.out.println("enter elements");   
 for(int i=0 ; i <  3;i++){
 for(int j = 0; j < 3; j++ ){
 
 
 arr[i][j] = s1.nextInt();
 System.out.println();
 }
 }
 
  for(int i=0 ; i <  3;i++){
 for(int j = 0; j < 3; j++ ){
   
 
 System.out.print(" "+ arr[i][j]);
 
 
 }
 System.out.println(" ");
 }
 
   
    }
    
   
   
   }           
       


        
    

