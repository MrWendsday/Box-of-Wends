import java.util.Scanner;

public class EZTimesTable 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to be multiplied: ");
		int x = input.nextInt();
			for (int i = 1 ; i <= 10 ; i++)
				System.out.println(x + " * " + i + " = " + x*i );

	}
}

