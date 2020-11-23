public class Main{
    
    public static void main(String args[]){
        
        int arr[] = {2,100,99,100,0};
        
        int min;
        for(int i = 0 ; i<arr.length;i++){
            min = i;
            for(int j = i+1 ; j< arr.length;j++){
                
                if(arr[min] > arr[j]){
                    
                    min = j;
                    
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        
        
        for(int i = 0; i< arr.length;i++){
            
            
            System.out.print(arr[i] + " ");
            
        }
        
        
        
        
        
        
    }
    
}
