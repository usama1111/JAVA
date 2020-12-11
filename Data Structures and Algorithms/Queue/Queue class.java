
public class Main
{
    int queue[];
    int rear;
    int front;
    int size; 
    
    public Main(int sizeOfArray){
        
 queue = new int[sizeOfArray];
 rear= -1;
 front = -1;
  size = 0;        
        
    }
    
    public boolean isEmpty(){
        
        boolean response = false;
        
        if(size == 0){
            
            response = true;
            
        }
        return response;
    }
    
    public boolean enqueue(int element){
        
        boolean response = false;
        
        if(rear != queue.length-1){
            
            rear++;
            queue[rear] = element;
            size++;
            response = true;
        }
        return response;
    }
    
	public int  dequeue(){
	    
	    int response = 0;
	    if(size != 0){
	        
	        front++;
	        response = queue[front];
	        size--;
	    }
	    return response;
	}
	public int GetFront(){
	    
	    int response = 0;
	    if(!isEmpty()){
	        
	        response = queue[front + 1];
	        
	    }
	    return response;
	}
	public int GetRear(){
	    
	    int response = 0;
	    if(!isEmpty()){
	        
	        response = queue[rear];
	        
	    }
	    return response;
	}

	public static void main(String args[]){
	    
	    Main queue = new Main(4);
	    queue.enqueue(1000);
	    queue.enqueue(5);
	    queue.enqueue(9);
	      queue.enqueue(11);
	  
	   queue.dequeue();
	    
	   
	    System.out.println("FRONT " +  queue.GetFront());
	     System.out.println("REAR " + queue.GetRear());
	    
	}
	
}
