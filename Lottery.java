package classcode;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number < 100: ");
		int guess = input.nextInt();
		System.out.printf("The lottery value is %d.  ", lottery);
		if (lottery == guess) {
			System.out.println("Congratulations!  You won $5,000.");
		} else {
			String sGuess = Integer.toString(guess),
					sLottery = Integer.toString(lottery);
			if (sGuess.length() == 1) sGuess = "0" + sGuess;
			if (sLottery.length() == 1) sLottery = "0" + sLottery;
			if (sGuess.charAt(0) == sLottery.charAt(1) &&
					sGuess.charAt(1) == sLottery.charAt(0)) {
				System.out.println("Congratulations!  You won $1000.");
			} else {
				if (sGuess.charAt(0) == sLottery.charAt(0) ||
					sGuess.charAt(0) == sLottery.charAt(1) ||
					sGuess.charAt(1) == sLottery.charAt(0) ||
					sGuess.charAt(1) == sLottery.charAt(1)) {
					System.out.println("Congratulations - you won $250.");
				} else {
					System.out.println("Better luck next time!");
				}

			}
				
		}
	}
}
