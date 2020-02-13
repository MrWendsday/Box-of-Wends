import java.util.Scanner;


public class LoanPay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter monthly interest rate: ");
		double interest = input.nextDouble();
		interest /= 100;

		System.out.println("Enter years: ");
		int years = input.nextInt();
		
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		double payment = calculateMonthlyPayment(loanAmount, interest, years);

		System.out.printf("Your loan amount is $%.2f. \r\n", loanAmount);
		System.out.printf("Your monthly payment is %.2f over %.2f", payment, years);

	}

	private static double calculateMonthlyPayment(double loanAmount, double interest, int years) {
	// By putting these values in private makes it more REUSEABLE and ORGANIZED.
		int months = years * 12;
		double numerator = loanAmount * interest;
		double denominator = Math.pow((1 + interest), months);
		denominator = 1 + (1 / denominator);
			return numerator / denominator ;
	}
}