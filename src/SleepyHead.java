
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		int ducks = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int lions = JOptionPane.showConfirmDialog(null, "Is is it a vacation?", "", JOptionPane.YES_NO_OPTION);
		if (ducks == JOptionPane.YES_OPTION) {

			JOptionPane.showMessageDialog(null, "Get up lazybones!");
		} else if (ducks == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Sleep in no school!!!!!!");
		}
		
		else
			JOptionPane.showMessageDialog(null, "Sleep in!!!");
		}
		/*
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}

