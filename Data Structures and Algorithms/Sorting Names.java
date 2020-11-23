import java.util.*;
public class Main{
    
    public static void main(String args[]){
        
        Scanner s1 = new Scanner(System.in);
        String names[] = {"zubair","ashraf","ismail" ,"ak"};
        
        for(int i = 0 ;i<names.length;i++){
            for(int j =i+1; j< names.length;j++){
                
                if(names[i].charAt(0) > names[j].charAt(0)){
                    
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    
                }
                
            }
        }
        System.out.println("Sorted names");
        for(int i = 0 ; i< names.length;i++){
            
            System.out.print(names[i] + " ");
            
        }
        
        
    }
    
}
