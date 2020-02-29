import java.util.Scanner;

class task9{

public static void main(String args[])
{


        Scanner obj9 = new Scanner(System.in);
        System.out.print("Enter a character:");
        char alph = obj9.next().charAt(0);
        if(alph>='a' && alph<='z' ||alph>='A' && alph<='Z'){
            if(alph=='a'|| alph=='e'|| alph=='i'|| alph=='o'|| alph=='u'|| alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'){
                System.out.println("Its vowel");
            }
                else {
                    System.out.println("Its consonent");
                }
          }
          else{
              System.out.println("Its not an alphabet");
          }
}
}
