
public class Main {
    
  static   void Merge(int arr[], int l, int mid, int r) 
    {
    int n1 = mid - l + 1; 
        int n2 = r - mid; 
  
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[mid + 1 + j]; 
        int i =0 ;
        int j=0; 
        int k= l;
        
        while(i < n1 && j < n2){
            
            if(L[i] <= R[j]){
                
                arr[k] = L[i];
                i++;
                
            }
            else{
                
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            
            arr[k] = L[i];
            i++;
            k++;
            
        }
        while( j < n2){
            
            arr[k] = R[j];
j++;
k++;
        }
        
    }
    
static    void sort(int arr[],int l , int r){
        
        if(l < r){
            
    int mid = (l + r) / 2;
        
        sort(arr,l,mid);
        sort(arr,mid + 1,r);
            
            Merge(arr,l,mid,r);
        }
        
        
    }
    
    
    
    public static void main(String args[]){
        
        int arr[] = {2,21,22,0,27};
        
        sort(arr,0,arr.length-1);
        
        for(int h = 0 ; h< arr.length;h++){
            
            System.out.print(arr[h] + " ");
            
        }
        
    }
    
}
