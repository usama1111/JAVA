import java.util.ArrayList;
import java.util.Scanner;
class Array{
 ArrayList<Integer> list=new <Integer>ArrayList();
 int max = 0;
 void show(){
     int count=0;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter numbers");
     int num=input.nextInt();
     while(num != 0 )
     {
         
          list.add(num);
         num=input.nextInt();
         count=count+num; 
     }
     System.out.println(count);
        }
     void maxNumber()
     {
		 
		 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		
		
		
	}
	public String toString(){
	    return ("The largest number in the input is " + max);
	   }
}
 class Task3{
    public static void main(String[] args)
 {
     
     Array[] p=new Array[1];
     p[0]= new Array();
     for(int i=0;i<p.length;i++)
     {
     p[i].show();
     }
     for(int i=0;i<p.length;i++)
     {
         p[i].maxNumber();
     System.out.println(p[i]);
        }
    }

}