import java.util.Scanner;

public class LengthConversion {
	public static void main(String[] args) {
		System.out.print("Enter number of inches: ");
		Scanner input = new Scanner(System.in);
		double inch = input.nextDouble();
		double meter = (0.0254 * inch);
		System.out.printf("That's %f meters.", meter);

	}

}