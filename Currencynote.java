package note;
import java.util.*;
public class Currencynote 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input amount
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int remainingAmount = amount;

        // Denominations in descending order
        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[notes.length];

        // Calculating notes
        for (int i = 0; i < notes.length; i++) 
        {
            if (remainingAmount >= notes[i]) 
            {
                noteCounter[i] = remainingAmount / notes[i];
                remainingAmount = remainingAmount % notes[i];
            }
        }

        // Displaying results
        System.out.println("\nCurrency Count for " + amount + ":");
        for (int i = 0; i < notes.length; i++) 
        {
            if (noteCounter[i] != 0) 
            {
                System.out.println("Rs. " + notes[i] + " : " + noteCounter[i]);
            }
        }
        
        scanner.close();
    }
}









