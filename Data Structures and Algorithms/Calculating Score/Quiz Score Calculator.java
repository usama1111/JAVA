import java.util.*;
public class Main{
    
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter rows");

        int rows = s1.nextInt();
        int col = 3;
        int arr[][] = new int [rows][col];
        
        System.out.println("Enter 0 if you dont know the answer and 1 if you know");
        for(int i = 0; i <= rows-1;i++){
            for(int j = 0; j<= col-1;j++){
                
                
            arr[i][j] = s1.nextInt();
            }
            
            
            
        }
        
            for(int i = 0; i <= rows-1;i++){
            for(int j = 0; j<= col-1;j++){
                
        System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
            
            
        }
        int count = 0;
        int score = 0;
           for(int i = 0; i <= rows-1;i++){
            for(int j = 0; j<= col-1;j++){
    

        
        if(arr[i][j] == 1){
            
            count++;
            
        }
            
            if(count == 2 || count == 3){
                
                score++;
                break;
            }
            
            
        }
        
            count = 0;    
            
        
        
    
               
            }
                System.out.println("score is"+ score);
            
            
        }}
    
    
