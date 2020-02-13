import java.util.Scanner;
import java.util.InputMismatchException;

public class CoinCalc 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How much you got? ");
	
		while(true) { 	 

			try {
				double total = input.nextDouble();
				int dollars = (int)(total); // This is what's called an explicit cast (i.e casting the double as an int).
				total -= dollars;			// Which then truncates or forces the double to show an int value
				int quarters = (int)(total / 0.25); // (0.78/0.25) = 3.12 but because of explicit cast, it will show 3.
				total -= quarters * 0.25; // Subtraction Assignment Operator leads to: (old total 0.78)-(3*0.25 = 0.75) = new total = 0.03
				int dimes = (int)(total / 0.10);
				total -= dimes * 0.10;
				int nickels = (int)(total / 0.05);
				total -= nickels * 0.05;
				int pennies = (int)(total / 0.01);
				total -= pennies * 0.01;

				/* The explicit cast is explicitly telling the compiler that it's ok to treat the variable as this specific class
					 i.e. double total = input.nextDouble();
				  		  int dollars = (int)(total);
				  		  Compiler is being told that its ok to treat TOTAL as an INT */ 

				
				
				System.out.println(" You have " + dollars + " dollars." );
				System.out.println(" You have " + quarters + " quarters." );
				System.out.println(" You have " + dimes + " dimes." );
				System.out.println(" You have " + nickels + " nickels." );
				System.out.println(" You have " + pennies + " pennies." );
				System.out.println(" You rich bastard.");
				break;  // Return takes you to the top of the method and breaks all loops.
						// Break can also work, but breaks the inner most loop if several present.
			}

			catch(InputMismatchException ad) { 
				String badInput = input.next();
				System.out.println(badInput + " is not money, dumbass.");
				System.out.println("Try Again.");
				continue;				
				
			} 
		}
	}
}