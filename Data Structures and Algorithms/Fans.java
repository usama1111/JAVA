import java.util.*;
public class Main{
    
    public static void main(String args[]){
        
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    
    
    System.out.println("Enter the number ");
    int  number = s1.nextInt();
    
    
    
    
    String name[] = new String[number];
    int fan_qoutient[] = new int[number];
    
    System.out.println("Enter name then fan qoutient");
    for(int i = 0; i<= number - 1 ;i++){
        
        System.out.println("enter name");
        name[i] = s2.nextLine();
        
        System.out.println("enter fan_qoutient");
        fan_qoutient[i] = s1.nextInt();
    }
    
    
    
        
        for(int i = 0 ; i<= number-1;i++){
            for(int j = i+1; j<= number-1;j++){
            if(fan_qoutient[i] > fan_qoutient[j]){
                
                int temp = fan_qoutient[i];
                fan_qoutient[i] = fan_qoutient[j];
                fan_qoutient[j] = temp;
                
                String  temp2 = name[i];
                name[i] = name[j];
                name[j] = temp2;
                
            }
        }
        
    }
    System.out.println("enter the number of fans to neet");
    int number_of_fans = s1.nextInt();
 for(int k = 0 ; k<= number_of_fans;k++){
     for(int l = 0 ; l<= number_of_fans;l++){
     if(fan_qoutient[k] == fan_qoutient[l]){
         
        if(name[k].charAt(0) > name[l].charAt(0)){
            
            String temp3 = name[k];
            name[k] = name[l];
            name[l] = temp3;
            
        }
         
     }
     
 }}
 
 
    for(int i = 0; i<= number_of_fans;i++){
        
        System.out.println(name[i] + "  "+ fan_qoutient[i]);
    }   }
}
