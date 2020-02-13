/*	Objective: Take user input and reduce the length of the string by
*	combining any repeated characters and use a number to replace the 
*	repeated parts.
*
*	1.	Prompt user input - via Scanner or FileReader.
*	2.	Split the string or words via delimiters, if needed.
*	3.	Count how many characters there are in a word.
*			a. Probably a for loop.	 
*	4.	See which letters repeat, how many times, and store it to the variable.
*			a. If it has 2 or more letters then it gets compressed.
*	5.	Then replace the repeated letters except the first one with the number.
*
*/

import java.util.Scanner;

public class Compression 
{
	public static void main(String[] args)
	{
		CountCharacters();
	}

	private static Scanner InputWord()
	{
		System.out.println("Enter a word: ");
		Scanner input = new Scanner(System.in);
		return input;
	}

	private static void CountCharacters()
	{
		Scanner input = InputWord();
		String text = input.nextLine().toLowerCase();
		int count = 0;
		for (int i = 0; i < text.length(); i++)
		{
			count++;
		}
		System.out.println(text + " " + count);

	}
}