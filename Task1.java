public class Main{public static void main(String[] args) {    
StringBuilder NumberPlate = new StringBuilder();  
  for (int a = 0; a < 3; a++)

 {        char ch = (char) (Math.random() * 26 + 'A');  
      NumberPlate.append(ch);    } 
   for (int a = 0; a < 3; a++) {        char digits = (char) (Math.random() * 10 + '0');        
NumberPlate.append(digits);    }    
System.out.println("Random vehicle plate number is : " + NumberPlate);}}