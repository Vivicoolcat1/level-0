
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class tortoisepower {
	public static void main(String[] args) {
for (int i = 0; i < 100; i++) {
	

		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog(
				"what color ink would you like the tortoise have (your options are cyan,blue,red,green ");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (color.equals("Red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("green")) {
			Tortoise.setPenColor(Color.green);
		}
		if (color.equals("cyan")) {
			Tortoise.setPenColor(Color.cyan);
		}
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}

		// 5. if the user doesn’t enter anything, choose a random color
if(color.equals("")){ 
	Tortoise.setPenColor(Colors.getRandomColor());
}
	
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		Tortoise.penDown();
		int turn = 90;
				turn++;
		for (int j = 0; j < 4; j++) {
			Tortoise.move(200);
		Tortoise.turn(90);

		}

	}
}
}