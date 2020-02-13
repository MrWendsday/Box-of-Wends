import java.util.Scanner;

public class MathSet {
	public static void main(String [] args) {
		/* int inputSeconds = 130;
		int minutes = inputSeconds / 60;
		int secondsLeft = inputSeconds % 60;
		// "= inputSeconds - minutes * 60" also works
		System.out.println("It is " + minutes + " minutes and " + secondsLeft +" seconds."); */

		System.out.print("Enter the total seconds: ");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt() / 60;
		int seconds = (System.in) % 60; /* Stuck on how to use the same input for two different operations
									 		   without having to use input.nextInt twice */
		

		System.out.printf("That's %s minutes and %s seconds.", minutes, seconds);
	}
}