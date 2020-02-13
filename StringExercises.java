package classcode;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;
public class StringExercises {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//reverseSentence();
		//dashes2Carets();
		characterCount();
	}
	
	private static void reverseSentence() {
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		System.out.printf("The reversed sentence is: %s", 
				splitReverseAndJoin(sentence, " ", " "));
	}

	private static void dashes2Carets() {
		System.out.print("Enter characters and dashes: ");
		String sentence = input.nextLine();
		System.out.printf("The result is: %s", 
				splitReverseAndJoin(sentence, "-", "^"));
	}
	
	private static String splitReverseAndJoin(String input,
			String splitBy, String joinBy) {
		 String[] words = input.split(splitBy);
		 ArrayUtils.reverse(words);
		 return String.join(joinBy, words);
	 }
	
	private static void showTheChar() {
		System.out.print("Enter some text: ");
		String text = input.nextLine();
		System.out.print("Enter a number: ");
		int index = input.nextInt();
		if (index >= 0 && index < text.length()) {
			System.out.printf("That character is %c.", text.charAt(index));
		} else {
			System.out.println("That character is out of range.");
		}
	}
	
	private static void showTheCharTC() {
		System.out.print("Enter some text: ");
		String text = input.nextLine();
		System.out.print("Enter a number: ");
		int index = input.nextInt();
		try {
			System.out.printf("That character is %c.", text.charAt(index));
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("That character is out of range.");
		}
	}
	
	private static void characterCount() {
		System.out.print("Please enter some text: ");
		String text = input.nextLine();
		int nLetters = 0, nDigits = 0, nOther = 0;
		for(int i=0; i<text.length(); ++i) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) nLetters++; else
				if (Character.isDigit(ch)) nDigits++; else
					nOther++;
		}
		System.out.format("%d letters  %d digits  %d other",
				nLetters, nDigits, nOther);
	}
}
