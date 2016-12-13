
	
	import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


	public class DizzyTortoise {


		public static void main(String[] args) {
					 
			 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String dizzySpins = JOptionPane.showInputDialog("on a scale of 1-10 how dizzy are you?;D");
int dizzySpins2 = Integer.parseInt(dizzySpins);

	 // 1. Use the dance method to make the Tortoise spin.
			  dance( dizzySpins2);


		}


		static void dance(int numberOfSpins) {
			for (int i = 0; i < numberOfSpins; i++) {
				Tortoise.turn(360);
			}
		}
	}



