public class Main{
    
    public static void main (String args[]){
        
        int arr[] = {1,9,6,45,2};
        int n = arr.length;
        
        
        for(int j = 1; j < n; j++){
            int i = j-1;
        int key = arr[j];    
        while(1 > -1 && arr[i] > key){
            
        
            
            arr[i + 1] = arr[i];
            i--;
        }    
        
        
        arr[i + 1] = key ;
        }
    for(int i = 0 ; i < arr.length;i++){
        
        System.out.println(arr[i]);
    }    
    
    }
}
