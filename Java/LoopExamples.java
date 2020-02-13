public class LoopExamples
{
	public static void main(String[] args) 
	{
		WhileLoopExample();	
	}

	private static void WhileLoopExample()
	{
		int count = 5;
		while (count > 0)
		{
			System.out.println(count--);
		}
	}
}