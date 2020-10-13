/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author fa19-bsse-0061
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
int arr [] = {1,2,4,6,9};
boolean found = false;


Scanner s1 = new Scanner(System.in);

System.out.println("enter a number to search");
int key = s1.nextInt();

for(int i = 0 ; i <= arr.length - 1; i++){

if( arr[i] == key ){

System.out.println("the value is at " + i);
found = true;
}
}

if(found != true){

System.out.println("not found");

}        
else{


System.out.println("found");

}        

    }
    
}
