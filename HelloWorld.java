public class HelloWorld 
{
	 /* public is accessible from anywhere. Everything between the {curly brace} is now part of the class HellowWorld. */
	public static void main(String[] args) 
	/* void means this method doesn't return a value */
	/* void returns/promises nothing */
	/* main is the primary entry point */

	/* Syntax order does matter */
	{
		System.out.println("Hello World!");
		/* System is a type of class. Out is a field of system */
		/* Every statement in java is ended with a semi colon ; 
		Without the ; it will result in a compiler error */
		double radius = 2.0;
		double area = Math. PI * radius * radius;
		/* double is a floating point value, so it can represent decimal numbers */
			/* Math is a mathematical function built in, also a class in itself */
		System.out.println("The area is " + area + ".");
		String message = "Hello";
		message = message.concat(" World!");
		/* Concat is an example of different methods of using string commands */
		System.out.println(message);
		/* Anything in between quotation marks " " is a string */

		drawHouse();
	}

		private static int drawHouse()
		/* The keyword 'int' represents an integer type, a description of the 
		memory that is used to hold the value. This type also imposes 
		restrictions on its use. For example, you can't store a fractional 
		number in an integer. Also, you cannot perform mixed-type calculations 
		without some additional manipulation */ 
		{
			/* By add int, I've promised to return a value to this project */
			System.out.println("Drawing a house....");
			return 5;
		}
	}
