/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.*;
/**
 *
 * @author fa19-bsse-0061
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");
        
    int n = s.nextInt();
int arr[] = new  int[n];

for(int i = 0; i < n; i++ ){

arr[i] = s.nextInt();


}
for(int i = 0; i < n; i++ ){

System.out.println("you have entered " + arr[i]);
}
        

        
    }    
}
