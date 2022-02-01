/* Michael Smith
 CS1400
 Assignment 3
 9-28-2021
*/
import java.util.Scanner;
public class TaskA  
{
    public static void main(String[] args)
    {
        double tracksbought;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tracks have you purchased dear customer? Please enter below: ");
        tracksbought = keyboard.nextDouble();

        if(tracksbought==0)
            System.out.println("You've Earned '0' Points");
        else if(tracksbought==1)
            System.out.println("You've Earned '10' Points");
       else if(tracksbought==2)
            System.out.println("You've Earned '30' Points");
        else if(tracksbought==3)
            System.out.println("You've Earned '60' Points");
        else if(tracksbought>=4)
            System.out.println("You've Earned '100' Points");

        System.exit(0);
        
        







    }
}
