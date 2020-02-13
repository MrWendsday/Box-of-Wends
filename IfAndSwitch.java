package classcode;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class IfAndSwitch {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		howManyDays();

	}
	
	private static void howManyDays() {
		System.out.print("Please enter a month number (1-12): ");
		int nMonth = input.nextInt();
		System.out.print("Please enter a year: ");
		int year = input.nextInt();
		YearMonth ym = YearMonth.of(year,  nMonth);
		//String monthName = ym.getMonth().getDisplayName(TextStyle.FULL, Locale.US);
		Month month = ym.getMonth();
		String monthName = month.getDisplayName(TextStyle.FULL, Locale.US);
		System.out.printf("%s, %d has %d days.", monthName, year, ym.lengthOfMonth());
	}
	
	private static void nameTheShape() {
		System.out.print("How many sides does your shape have? ");
		int nSides = input.nextInt();
		String shapeName = null;
		switch(nSides) {
		case 0: shapeName = "Not a shape"; break;
		case 1:	shapeName = "Point"; break;
		case 2: shapeName = "Line"; break;
		case 3: shapeName = "Triangle"; break;
		case 4: shapeName = "Quadrilateral"; break;
		case 5: shapeName = "Pentagon"; break;
		case 6: shapeName = "Hexagon"; break;
		case 7: shapeName = "Heptagon"; break;
		case 8: shapeName = "Octagon"; break;
		case 9: shapeName = "Nonagon"; break;
		case 10: shapeName = "Decagon"; break;
		case 11: shapeName = "Hendecagon"; break;
		case 12: shapeName = "Dodecagon"; break;
		default: 
			if (nSides < 0) System.out.println("What planet are you from?"); else
				System.out.println("I can't count that high.");
			return;
		}
		System.out.println("That shape is a " + shapeName + ".");
	}

}
