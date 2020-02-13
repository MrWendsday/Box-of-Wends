import java.util.Scanner;

public class TwoInput {
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		int product = a * b;

		System.out.println("The product is " + product);
;	}
}