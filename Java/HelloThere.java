public class HelloThere 
{
	public static void main(String [] args) 
	{
		System.out.println("Hello there.");
			try 
			{
    		Thread.sleep(1000);
			}
			catch(InterruptedException ex) 
			{
    		Thread.currentThread().interrupt();
			}
System.out.println("\r\nGeneral Kenobi.\r\n");
System.out.println("This \t(Tab) is a text test of \b(Backspace) the escape sequences \n(NewLine) found in Java to \r(CarriageReturn) see what each \f(Formfeed) sequence does \'since the name \"is very ambiguous. Doing a few more \\lines to fill space for more room.\r\n");

int alpha = 3;
int beta = alpha++ + 1;
int charlie = ++alpha + 1;
System.out.println("Value of " + beta +" .");
System.out.println("Value of " + charlie +" .");
	}
}