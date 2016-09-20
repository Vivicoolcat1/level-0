
import java.util.Random;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {

		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(1001);
		// 2. Print out the random variable above

		// 11. do the following 10 times

		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String ducks = JOptionPane
					.showInputDialog("Guess my number it is between 0-1000 you will get a millon $$$$$$ :D");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int platupus = Integer.parseInt(ducks);
			// 5. if the guess is correct
			if (platupus == random) {
				// 6. win
				JOptionPane.showMessageDialog(null,
						"Oh your still here :|You win I guess? BTW you don't get one million $$ all you get is knowing you won a really dumb game.");
				System.exit(0);
			}
			// 7. if the guess is high
			if (random < platupus) {
				// 8. tell them it's too high
				JOptionPane.showMessageDialog(null, "ITS TOO HIGH GO LOWER C'MON GIVE IT YOU BEST SHOT");
			}
			// 9. if the guess is low
			if (random > platupus) {
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "SERIOUSLY TOO LOW GIVE UP ALREADY!!!!!!!!");
			}
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null,
				"Wow you failed at life cuzz you failed at this time waisting game why are you even still here?");
	}

}
