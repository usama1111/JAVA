import java.io.*;
import java.util.Random;

 class Dices
{
    public static void main( String[] args )
    {
        Random ran = new Random();
        int number = 0;

        for (int x = 0; x <10; x++) {
            number = ran.nextInt(6)+1;
            //System.out.println(number);

        }



            try (PrintWriter file = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("test1.txt")));
            ) {

                for (int i = 1; i <= 10; i++) {
                    file.println(number);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("File test1.txt has been created!");


        }
    }