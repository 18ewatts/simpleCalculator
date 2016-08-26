
/**
 * Write a description of class calculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class calculator
{
    public static void main(String [] args)
    {
        double x = 20; 
        double y = 10;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        x = reader.nextDouble();   
        System.out.println("Enter an operator (1. +, 2. -, 3. *, 4. /): ");
        int operator = reader.nextInt();
        System.out.println("Enter another integer: ");
        y = reader.nextDouble(); 
        if (operator == 1)
        {
            System.out.println(x + y);
        }
        if (operator == 2)
        {
            System.out.println(x - y);
        }
        if (operator == 3)
        {
            System.out.println(x * y);
        }
        if (operator == 4)
        {
            System.out.println(x / y);
        }
    }
}
