import java.util.Scanner;

public class HexToDec
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Hexadecimal Value: ");
		String hex = input.nextLine();
		int dec = Integer.parseInt(hex, 16); // First argument 'hex' refers to the variable, Second argument '16' refers to the answer being in base 16.
		System.out.println("The decimal value of " + hex + " is " + dec + " .");		
	}
}


/*			
			String s = input.nextLine().toUpperCase();
				while(true);
				{
					try 
					{
						char c = s.charAt(0);
						String result = "" + c;
							if (C >= 'A') 
							{
								int value = 10 + c - 'A';
								result = "" + value;
							}
						break;
					}
				}

			char c = s.charAt(0);
			String result = "" + c;
				if (C >= 'A') 
				{
					int value = 10 + c - 'A';
					result = "" + value;
				}

				catch(NumberFormatException ad)
				{
					System.out.println(hex + " is invalid you invalid\n\r.");
					System.out.println("Try Again.");
						continue;
				} 
*/
