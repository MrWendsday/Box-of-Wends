package classcode;
import java.time.Year;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class ChineseZodiac {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * System.out.print("Enter a year: ");
		 * System.out.printf("The zodiac animal is %s.",
		 * animalForYear(input.nextInt()));
		 */
			System.out.print("Enter your animal: ");
			String animal = input.nextLine();
			showNextYearForAnimal(animal);
		}
	
	private static final String[] animals = { "monkey", "rooster",
		"dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon",
		"snake", "horse", "sheep" 
	};
	
	private static String animalForYear2(int year) {
		return animals[year];
	}
	
	private static String animalForYear(int year) {
		String animal = null;
		switch(year % 12) {
			case 0: animal = "monkey"; break;
			case 1: animal = "rooster"; break;
			case 2: animal = "dog"; break;
			case 3: animal = "pig"; break;
			case 4: animal = "rat"; break;
			case 5:	animal = "ox"; break;
			case 6: animal = "tiger"; break;
			case 7: animal = "rabbit"; break;
			case 8: animal ="dragon"; break;
			case 9: animal = "snake"; break;
			case 10: animal = "horse"; break;
			case 11: animal = "sheep"; break;
		}
		return animal;
	}

	private static void showNextYearForAnimal(String animal) {
		int animalMod = yearModForAnimal(animal);
		if (animalMod < 0) {
			System.out.printf("It will never be the year of the %s.", animal);
		} else {
			Year y = Year.now();
			int currentYear = y.getValue(), currentMod = currentYear % 12;
			if (animalMod < currentMod) {
				currentYear = currentYear - currentMod + 12;
			} else {
				currentYear = currentYear + animalMod - currentMod;
			}
			System.out.printf("The next year of the %s is %d.", 
					animal, currentYear);
		}
	}
	
	private static int yearModForAnimal2(String animal) {
		return ArrayUtils.indexOf(animals, animal);
	}
	
	private static int yearModForAnimal(String animal) {
		switch(animal.toLowerCase()) {
			case "monkey": return 0;
			case "rooster": return 1;
			case "dog": return 2;
			case "pig": return 3;
			case "rat": return 4;
			case "ox": return 5;
			case "tiger": return 6;
			case "rabbit": return 7;
			case "dragon": return 8;
			case "snake": return 9;
			case "horse": return 10;
			case "sheep": return 11;
			default: return -1;
		}
	}

}
