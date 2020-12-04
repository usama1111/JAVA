
import java.util.Stack;
public class Main {
 public static  Stack<Integer> sortStack(Stack<Integer> input){
         
        Stack<Integer> tmpStack = new Stack<Integer>();
           while(!input.isEmpty()) {
            int tmp = input.pop();
            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);   }

      System.out.println("after sorting" + tmpStack);
            tmpStack.pop();
      System.out.println("deletion of smallest element" + tmpStack);
             
       return tmpStack;   }
    public static void main(String args[]){
        Stack<Integer> input = new Stack<Integer>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);
        System.out.println("before sorting: "+input);   
   sortStack(input);          }}
