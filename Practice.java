import java.util.Arrays;
import java.util.Scanner;

public class Practice
{
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		CountArray();
	}

	private static void CountArray()
	{
		int hCount = 0;
		int tCount = 0;
		System.out.print("Enter either H or T: ");
		String[] strArr = new String[50];
		for (int i = 0; i < strArr.length; i++)
		{					
			if (strArr[i] == null)
			{
				strArr[i] = input.nextLine().toUpperCase();	
				if (strArr[i].equals("H"))
				{
					hCount++;
				}
				if (strArr[i].equals("T"))
				{
					tCount++;
				}				
			}			
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(strArr[i]);	
		}
		System.out.println();
		for (int i = 10; i < 20; i++) {
			System.out.print(strArr[i]);	
		}
		System.out.println();
		for (int i = 20; i < 30; i++) {
			System.out.print(strArr[i]);	
		}
		System.out.println();
		for (int i = 30; i < 40; i++) {
			System.out.print(strArr[i]);	
		}
		System.out.println();
		for (int i = 40; i < 50; i++) {
			System.out.print(strArr[i]);	
		}
		System.out.println();
		System.out.printf("Number of times H appears: %d\nNumber of times T appears: %d", hCount, tCount);
	}
}


