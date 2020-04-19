import java.io.*; 
import java.util.ArrayList; 
  
class ArrayListDemo { 
public static void main(String[] args) 
    { 
  
         
        ArrayList<Double> arrlist = new ArrayList<Double>(10); 
  
        arrlist.add(0.215); 
        arrlist.add(0.320); 
        arrlist.add(0.25); 
       
        for (Double number : arrlist) { 
            System.out.println("Number = " + number); 
        } 
        
arrlist.add(0,0.4);
arrlist.size();

System.out.println("array size is " +arrlist.size());
        for (Double number : arrlist) { 
            System.out.println("Number = " + number); 
        }
 
 arrlist.remove(0);
 System.out.println("after removing");
        for (Double number : arrlist) { 
            System.out.println("Number = " + number); 
        }
 arrlist.remove(arrlist.size() - 1);
 System.out.println("Removing last object");
  for (Double number : arrlist) { 
            System.out.println("Number = " + number); 
        }
 }

    
    
        
         
      

      
    
    } 
    
    
