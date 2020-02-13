// See: https://en.wikipedia.org/wiki/Euclidean_algorithm#Proof_of_validity

public class EuclideanAlgorithm
{
	public static void main(String [] args)
	{
		System.out.println(divisionBased(1071, 462));
		System.out.println(divisionBased(462, 1071));
		System.out.println();
		System.out.println(differenceBased(1071, 462));
		System.out.println(differenceBased(462, 1071));
		System.out.println();
		System.out.println(recursionBased(1071, 462));
		System.out.println(recursionBased(462, 1071));
		

	}
// All of these are doing the exact same thing, just different methods
	
	public static int divisionBased(int a, int b)
	{
		while (b != 0)
		{
			int t = b;
			b = a % b;
			a = t;
		}	
		return a; 
	}

	public static int differenceBased(int a, int b)
	{
			while (a != b)
			{
				if (a > b)
					a = a - b;
				else
					b = b - a;
			}
			return a;
	}

	public static int recursionBased(int a, int b)
	{
		if (b == 0)
			return a;
		else return recursionBased(b, a % b);
	}
}