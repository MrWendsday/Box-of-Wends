public class ShortCircuit 
{

	private static boolean False() 
	{
		System.out.println("False");
		return false;
	}

	private static boolean True()
	{
		System.out.println("True");
		return true;
	}

	public static void main(String[] args) 
	{
		boolean result = False() || True(); //FalseTrue
		result = True() || False(); //True

		result = False() && True() //False
		result = True() && False() //True
	}

	public static void PreAndPost() 
	{
	int a = 5;
	int b = 6;
	int c = ++a * (a * j); 		// a goes up in value first then equation runs. So a = 6, then runs.
	int d = ++a * (++a * j); 	// the a in the parantheses increments first, then the outside a increments. So (a) = 6, then a() = 7.
	int e = a++ * (a * j) 	// Equation runs first, then a increments, does not effect current equation.
							// So 5*(5*6) = 150 then a = 6

	int x = 5, y = 8;
	int result = (x++ * y - x); // Evaluates, assigns, then increments.
								// (5 * 8 - 5) + 1 = 35
	int result = (++x * y - x); // Increments, evaluates, then assigns.
								// (1+5) * 8 - 6 = 42
	String message = (1 == 6) ? "Six" : "Not six."
	}
}


