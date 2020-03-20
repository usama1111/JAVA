import java.util.Scanner;
public class Main{public static void main(String[] args) 
{ Scanner obj = new Scanner(System.in);
        double  rainfallarr[] = new double[12]; 
       for (int i =0 ;i<=11;i++)        {                 
   System.out.print("Enter rain value of month "+(i+1)+":");  
              rainfallarr[i] = obj.nextDouble();        }
            for (int i = 0; i <= 11; i++) {                if(rainfallarr[i] >=1)
 {                }else
                {                    System.out.println("Exception should in be in 1");
                }            }        int total_rainfall = 0;        for (int i =0 ;i<=11;i++)        {            total_rainfall +=rainfallarr[i];  
      }        System.out.println("Total rainfall of the year :  "+total_rainfall);        for (int i =0 ;i<=11;i++)        {            total_rainfall +=rainfallarr[i];        
}        int average = total_rainfall/12;        System.out.println("Average monthly rain fall is : "+average);         double MAX = 0.0;        for (int i =0 ;i<=11;i++)        {            if(MAX < rainfallarr[i])            {                MAX = rainfallarr[i];            }        }      
  System.out.println("Maximum value  : "+MAX);        double MIN = Integer.MAX_VALUE;        for (int i =0 ;i<=11;i++)        {            if(MIN > rainfallarr[i])            {                MIN = rainfallarr[i];            }        }     
   System.out.println("Minimum value : "+MIN);}}